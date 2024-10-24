package pl.marianjureczko.finder.audible

import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.select.Elements
import pl.marianjureczko.finder.nlp.SIMILARITY_THRESHOLD
import pl.marianjureczko.finder.nlp.TitleComparator

class ResponseAnalyser {
    private val titleComparator = TitleComparator()
    private val english = "english"
    private val polish = "polish"

    fun execute(resultBody: String, titleToSearch: String): String {
        val document = Jsoup.parse(resultBody)
        val allBooks: Elements = document.select("li.bc-list-item.productListItem")
        val parsedBooks = allBooks.map { book -> parseHtml(book) }
        return parsedBooks
            .filter { it.language.contains(english) || it.language.contains(polish) }
            .map { item -> item to titleComparator.similarity(item.title, titleToSearch) }
            .filter { (_, similarity) -> similarity > SIMILARITY_THRESHOLD }
            .maxByOrNull { (_, similarity) -> similarity }?.first?.link ?: ""
    }

    private fun parseHtml(book: Element): AudibleBook {
        val titleHeader = book.selectFirst("h3")
        val titleLink = titleHeader?.selectFirst("a.bc-link.bc-color-link")
        val link = titleLink?.attribute("href")?.value
        val title = titleLink?.text()
        val language = book.selectFirst("li.bc-list-item.languageLabel")?.text()?.lowercase()
        val interpretedLink = link?.let { RetrofitClient.BASE_URL + it } ?: "ERROR"
        return AudibleBook(title ?: "", language ?: "", interpretedLink)
    }
}