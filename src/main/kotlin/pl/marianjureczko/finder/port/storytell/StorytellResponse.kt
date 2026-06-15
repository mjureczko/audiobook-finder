package pl.marianjureczko.finder.port.storytell

import pl.marianjureczko.finder.nlp.SimpleBook

data class StorytellResponse(
    val items: List<BookItem>?
)

data class BookItem(
    val title: String,
    val shareUrl: String,
    val language: String?,
    val authors: List<Author>?
) : SimpleBook {
    override fun title(): String = title
    override fun link(): String = shareUrl
}

data class Author(
    val name: String?
)
