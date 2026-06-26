package pl.marianjureczko.finder.port.storytell

import pl.marianjureczko.finder.authorMatches
import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class StorytellResponseAnalyser {

    private val acceptedLanguages = setOf("en", "pl")
    private val bestTitleMatchSelector = BestTitleMatchSelector()

    fun execute(resultBody: StorytellResponse, queryTitle: String, queryAuthor: String = ""): String {
        if (resultBody.items == null) return ""
        val filtered = resultBody.items.asSequence()
            .filter { item -> acceptedLanguages.contains(item.language) }
            .filter { item -> authorMatches(item.authors?.map { it.name ?: "" }, queryAuthor) }
        return bestTitleMatchSelector.select(filtered, queryTitle)
    }
}