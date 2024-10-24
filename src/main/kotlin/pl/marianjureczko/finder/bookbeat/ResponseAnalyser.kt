package pl.marianjureczko.finder.bookbeat

import pl.marianjureczko.finder.npl.SIMILARITY_THRESHOLD
import pl.marianjureczko.finder.npl.TitleComparator

class ResponseAnalyser {
    private val titleComparator = TitleComparator()
    fun execute(resultBody: BookbeatResponse?, title: String): String {
        return if (resultBody?._embedded?.books == null) {
            ""
        } else {
            resultBody._embedded.books
                .map { item -> item to titleComparator.similarity(item.title, title) }
                .filter { (_, similarity) -> similarity > SIMILARITY_THRESHOLD }
                .maxByOrNull { (_, similarity) -> similarity }?.first?.shareurl ?: ""
        }
    }
}