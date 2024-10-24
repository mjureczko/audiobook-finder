package pl.marianjureczko.finder.nlp

class BestTitleMatchSelector {

    private val titleComparator = TitleComparator()

    /** @return link to book with best title match or empty string when there is no match */
    fun <T : SimpleBook> select (books: Sequence<T>, queryTitle: String): String {
        return books
            .map { item -> item to titleComparator.similarity(item.title(), queryTitle) }
            .filter { (_, similarity) -> similarity > SIMILARITY_THRESHOLD }
            .maxByOrNull { (_, similarity) -> similarity }?.first?.link() ?: ""
    }
}