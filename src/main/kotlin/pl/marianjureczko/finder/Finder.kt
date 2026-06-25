package pl.marianjureczko.finder

interface Finder {
    fun findBook(titleEn: String, titlePl: String, author: String): List<Found>

    fun sourceTypes(): List<String>
}
