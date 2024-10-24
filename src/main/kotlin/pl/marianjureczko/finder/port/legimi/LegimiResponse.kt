package pl.marianjureczko.finder.port.legimi

import pl.marianjureczko.finder.nlp.SimpleBook

data class LegimiResponse(
    val bookList: BookList
)

data class BookList(
    val books: List<Book>
)

data class Book(
    val title: String,
    val url: String,
    val ebookFormat: Boolean,
    val audiobookFormat: Boolean
): SimpleBook {
    override fun title(): String =title
    override fun link(): String = url
}
