package pl.marianjureczko.finder.legimi

import pl.marianjureczko.finder.nlp.SIMILARITY_THRESHOLD
import pl.marianjureczko.finder.nlp.TitleComparator

class ResponseAnalyser {
    private val titleComparator = TitleComparator()

    fun execute(resultBody: LegimiResponse, title: String, filter: (Book) -> Boolean): String {
        var link = resultBody.bookList.books
            .filter(filter)
            .map { item -> item to titleComparator.similarity(item.title, title) }
            .filter { (_, similarity) -> similarity > SIMILARITY_THRESHOLD }
            .maxByOrNull { (_, similarity) -> similarity }?.first?.url ?: ""
        if (!("" == link)) {
            link = RetrofitClient.BASE_URL + link
        }
        return link
    }
}