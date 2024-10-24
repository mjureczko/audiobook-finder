package pl.marianjureczko.finder.port.legimi

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector
import pl.marianjureczko.finder.nlp.SIMILARITY_THRESHOLD
import pl.marianjureczko.finder.nlp.TitleComparator

class LegimiResponseAnalyser {
    private val bestTitleMatchSelector = BestTitleMatchSelector()

    fun execute(resultBody: LegimiResponse, queryTitle: String, filter: (Book) -> Boolean): String {
        val filtered = resultBody.bookList.books.asSequence()
            .filter(filter)
        var link = bestTitleMatchSelector.select(filtered, queryTitle)
        if ("" != link) {
            link = LegimiApi.BASE_URL + link
        }
        return link
    }
}