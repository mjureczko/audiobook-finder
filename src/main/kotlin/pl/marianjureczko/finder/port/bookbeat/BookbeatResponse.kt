package pl.marianjureczko.finder.port.bookbeat

import pl.marianjureczko.finder.nlp.SimpleBook

data class BookbeatResponse(
    val _embedded: Embedded?
)

data class Embedded (
    val books: List<BookbeatBook>
)

data class BookbeatBook (
    val title: String,
    val author: String?,
    val shareurl: String
) : SimpleBook {
    override fun title(): String = title
    override fun link(): String = shareurl
}
