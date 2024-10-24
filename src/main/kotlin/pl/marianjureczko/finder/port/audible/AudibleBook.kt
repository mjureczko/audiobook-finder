package pl.marianjureczko.finder.port.audible

import pl.marianjureczko.finder.nlp.SimpleBook

data class AudibleBook(
    val title: String,
    val language: String,
    val link: String
) : SimpleBook {
    override fun title(): String = title
    override fun link(): String = link
}
