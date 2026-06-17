package pl.marianjureczko.finder.port.libraryoborniki

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import pl.marianjureczko.finder.nlp.BestTitleMatchSelector
import pl.marianjureczko.finder.nlp.SimpleBook

class LibraryObornikiResponseAnalyser {

    private val bestTitleMatchSelector = BestTitleMatchSelector()
    private val copyCountPattern = Regex("""(\d+) z \d+""")

    fun execute(html: String, queryTitle: String): String {
        val doc = Jsoup.parse(html)
        val books = doc.select("p.h4 span.f_firas_EXC a")
            .asSequence()
            .filter { link -> hasAvailableCopies(doc, bookId(link.attr("href"))) }
            .map { link ->
                object : SimpleBook {
                    override fun title() = link.text().trim()
                    override fun link() = toAbsoluteUrl(link.attr("href"))
                }
            }
        return bestTitleMatchSelector.select(books, queryTitle)
    }

    private fun bookId(href: String): String =
        Regex("""/record_bibs/(\d+)""").find(href)?.groupValues?.get(1) ?: ""

    private fun hasAvailableCopies(doc: Document, id: String): Boolean {
        if (id.isEmpty()) return false
        return doc.getElementById("biblioteki_$id")
            ?.select("div.col-auto.mx-auto")
            ?.any { div ->
                val m = copyCountPattern.find(div.text().trim())
                m != null && m.groupValues[1].toInt() > 0
            } ?: false
    }

    private fun toAbsoluteUrl(href: String) =
        LibraryObornikiApi.BASE_URL.trimEnd('/') + href.substringBefore("?")
}