package pl.marianjureczko.finder.port.audible

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AudibleFinderTest {
    @Test
    fun shouldFindInAudible() {
        //given
        val finder = AudibleFinder()

        //when
        val actual = finder.findTitle("red dragon")

        //then
        assertEquals(1, actual.size)
        assertEquals("Audible", actual[0].sourceType)
        assertTrue(actual[0].link.startsWith("https://www.audible.com/pd/Red-Dragon-Audiobook/B007IKTSTY"))
    }
}