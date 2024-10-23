package pl.marianjureczko.finder.storytell

data class StorytellResponse(
    val items: List<BookItem>?
)

data class BookItem(
    val title: String,
    val shareUrl: String,
    val language: String?
)
