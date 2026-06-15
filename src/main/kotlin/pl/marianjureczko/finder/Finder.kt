package pl.marianjureczko.finder

interface Finder {
    fun findTitle(title: String): List<Found>
    fun findBook(title: String, author: String): List<Found> = findTitle(title)

    fun sourceTypes(): List<String>
}