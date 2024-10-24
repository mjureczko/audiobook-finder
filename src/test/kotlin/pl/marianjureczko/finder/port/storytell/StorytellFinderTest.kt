package pl.marianjureczko.finder.port.storytell

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pl.marianjureczko.finder.port.storytell.StorytellFinder

class StorytellFinderTest {
    @Test
    fun storytell() {
        val finder = StorytellFinder()
        finder.findTitle("Red dragon")
    }
}