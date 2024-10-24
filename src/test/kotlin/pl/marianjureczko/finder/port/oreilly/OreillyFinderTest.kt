package pl.marianjureczko.finder.port.oreilly

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OreillyFinderTest {
    @Test
    fun testFinding() {
        //given
        val finder = OreillyFinder()

        //when
        val actual = finder.findTitle("Introducing Python")

        //then
        assertEquals(2, actual.size)
        assertEquals(OREILLY_BOOK, actual[0].sourceType)
        assertEquals("https://learning.oreilly.com/library/view/introducing-python/9781449361167/", actual[0].link)
        assertEquals(OREILLY_AUDIOBOOK, actual[1].sourceType)
        assertEquals("https://learning.oreilly.com/videos/introducing-python/9781663721112/", actual[1].link)
    }
}