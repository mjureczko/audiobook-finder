package pl.marianjureczko.finder.port.oreilly

import pl.marianjureczko.finder.nlp.SimpleBook

data class OreillyResponse(
    val results: List<Book>
)

data class Book(
    val format: String,
    val language: String,
    val title: String,
    val web_url: String
) : SimpleBook {
    override fun title(): String = title

    override fun link(): String = web_url
}
