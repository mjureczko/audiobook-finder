package pl.marianjureczko.finder.port.storytell

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class StorytellResponseAnalyser {

    private val acceptedLanguages = setOf("en", "pl")
    private val bestTitleMatchSelector = BestTitleMatchSelector()

    fun execute(resultBody: StorytellResponse, queryTitle: String, queryAuthor: String = ""): String {
        if (resultBody.items == null) return ""
        val filtered = resultBody.items.asSequence()
            .filter { item -> acceptedLanguages.contains(item.language) }
            .filter { item -> authorMatches(item, queryAuthor) }
        return bestTitleMatchSelector.select(filtered, queryTitle)
    }

    private fun authorMatches(item: BookItem, queryAuthor: String): Boolean {
        if (queryAuthor.isEmpty()) return true
        val authors = item.authors
        if (authors.isNullOrEmpty()) return true
        return authors.any { author ->
            author.name?.lowercase()?.contains(queryAuthor.lowercase()) == true
        }
    }
}