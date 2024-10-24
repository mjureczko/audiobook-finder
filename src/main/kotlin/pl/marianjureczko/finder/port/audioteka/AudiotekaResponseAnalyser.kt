package pl.marianjureczko.finder.port.audioteka

import pl.marianjureczko.finder.nlp.BestTitleMatchSelector

class AudiotekaResponseAnalyser {
    private val bestTitleMatchSelector = BestTitleMatchSelector()
    fun execute(resultBody: AudiotekaResponse, queryTitle: String, klubOnly: Boolean): String {
        val products = resultBody.pageProps?.firstPage?.embedded?.product
        return products?.let{
            var books = it.asSequence()
                .map { it.data }
                .filterNotNull()
            if(klubOnly) {
               books = books.filter { book -> book.is_free == true || book.is_available_in_subscription == true }
            }
            bestTitleMatchSelector.select(books, queryTitle)
        } ?: ""

    }
}