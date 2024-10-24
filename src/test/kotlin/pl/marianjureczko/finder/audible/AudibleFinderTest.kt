package pl.marianjureczko.finder.audible

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AudibleFinderTest {
    @Test
    fun fetchFromAudible() {
        val finder = AudibleFinder()
        finder.findTitle("red dragon")
    }
}