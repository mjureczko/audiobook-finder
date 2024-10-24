package pl.marianjureczko.finder.port.storytell

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class StorytellResponseAnalyser {

    private val acceptedLanguages = setOf("en", "pl")
    private val bestTitleMatchSelector = BestTitleMatchSelector()

    fun execute(resultBody: StorytellResponse, queryTitle: String): String {
        if( resultBody.items == null) {
            return ""
        }
        val filtered = resultBody.items.asSequence()
            .filter { item -> acceptedLanguages.contains(item.language) }
        return bestTitleMatchSelector.select(filtered, queryTitle)
    }
}