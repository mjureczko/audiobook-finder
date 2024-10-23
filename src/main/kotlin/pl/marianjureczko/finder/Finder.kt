package pl.marianjureczko.finder

interface Finder {
    fun findTitle(title:String): List<Found>

    fun sourceTypes(): List<String>
}