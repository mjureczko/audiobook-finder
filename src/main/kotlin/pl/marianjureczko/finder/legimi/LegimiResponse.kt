package pl.marianjureczko.finder.legimi

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
)
