package pl.marianjureczko.finder.port.bookbeat

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class BookbeatResponseAnalyser {
    private val bestTitleMatchSelector = BestTitleMatchSelector()
    fun execute(resultBody: BookbeatResponse, queryTitle: String): String {
        return if (resultBody._embedded?.books == null) {
            ""
        } else {
            bestTitleMatchSelector.select(resultBody._embedded.books.asSequence(), queryTitle)
        }
    }
}