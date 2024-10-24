package pl.marianjureczko.finder.port.audioteka

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AudiotekaFinderTest {
    @Test
    fun testFinding() {
        //given
        val finder = AudiotekaFinder()

        //when
        val actual = finder.findTitle("czerwony alert")

        //then
        assertEquals(actual.size, 2)
        assertEquals(AUDIOTEKA, actual[0].sourceType)
        assertEquals("https://lstn.link/audiobook/db2cb6e9-d8d0-4f34-9210-81dc5b42fa4f", actual[0].link)
        assertEquals(KLUB, actual[1].sourceType)
        assertEquals("", actual[1].link)
    }
}