package pl.marianjureczko.finder.storytell

import pl.marianjureczko.finder.nlp.SIMILARITY_THRESHOLD
import pl.marianjureczko.finder.nlp.TitleComparator

class ResponseAnalyser {

    private val ACCEPTED_LANGUAGES = setOf("en", "pl")
    private val titleComparator = TitleComparator()

    fun execute(resultBody: StorytellResponse?, title: String): String {
        return if (resultBody?.items == null) {
            ""
        } else {
            resultBody.items
                        .filter { item -> ACCEPTED_LANGUAGES.contains(item.language) }
                        .map { item -> item to titleComparator.similarity(item.title, title) }
                        .filter { (_, similarity) -> similarity > SIMILARITY_THRESHOLD }
                        .maxByOrNull { (_, similarity) -> similarity }?.first?.shareUrl ?: ""
        }
    }
}