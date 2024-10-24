package pl.marianjureczko.finder.port.audible

import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class AudibleResponseAnalyser {
    private val english = "english"
    private val polish = "polish"
    private val bestTitleMatchSelector = BestTitleMatchSelector()

    fun execute(resultBody: String, queryTitle: String): String {
        val document = Jsoup.parse(resultBody)
        val allBooks: Elements = document.select("li.bc-list-item.productListItem")
        val parsedBooks = allBooks.map { book -> parseHtml(book) }
        val filtered = parsedBooks.asSequence()
            .filter { it.language.contains(english) || it.language.contains(polish) }
        return bestTitleMatchSelector.select(filtered, queryTitle)
    }

    private fun parseHtml(book: Element): AudibleBook {
        val titleHeader = book.selectFirst("h3")
        val titleLink = titleHeader?.selectFirst("a.bc-link.bc-color-link")
        val link = titleLink?.attribute("href")?.value
        val title = titleLink?.text()
        val language = book.selectFirst("li.bc-list-item.languageLabel")?.text()?.lowercase()
        val interpretedLink = link?.let { AudibleApi.BASE_URL + it } ?: "ERROR"
        return AudibleBook(title ?: "", language ?: "", interpretedLink)
    }
}