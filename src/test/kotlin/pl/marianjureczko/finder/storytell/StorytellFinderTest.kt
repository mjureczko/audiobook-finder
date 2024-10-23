package pl.marianjureczko.finder.storytell

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StorytellFinderTest {
    @Test
    fun storytell() {
        val finder = StorytellFinder()
        finder.findTitle("Red dragon")
    }
}