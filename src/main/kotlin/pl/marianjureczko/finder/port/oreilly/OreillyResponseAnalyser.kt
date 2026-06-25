package pl.marianjureczko.finder.port.oreilly

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class OreillyResponseAnalyser {
    private val bestTitleMatchSelector : BestTitleMatchSelector = BestTitleMatchSelector()
    fun execute(resultBody: OreillyResponse, queryTitle: String, contentType: String, queryAuthor: String = ""): String {
        val filtered = resultBody.results.asSequence()
            .filter { it.language == "en" || it.language == "pl" }
            .filter{contentType == it.format}
            .filter { authorMatches(it, queryAuthor) }
        var link = bestTitleMatchSelector.select(filtered, queryTitle)
        if ("" != link) {
            link = OreillyApi.BASE_URL + link
        }
        return link
    }

    private fun authorMatches(book: Book, queryAuthor: String): Boolean {
        if (queryAuthor.isEmpty()) return true
        val authors = book.authors
        if (authors.isNullOrEmpty()) return true
        val result = authors.any { author ->
            author.lowercase().contains(queryAuthor.lowercase())
        }
        return result
    }
}
