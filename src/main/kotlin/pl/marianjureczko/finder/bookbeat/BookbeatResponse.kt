package pl.marianjureczko.finder.bookbeat

data class BookbeatResponse(
    val _embedded: Embedded
)

data class Embedded (
    val books: List<BookbeatBook>
)

data class BookbeatBook (
    val title: String,
    val author: String?,
    val shareurl: String
)
