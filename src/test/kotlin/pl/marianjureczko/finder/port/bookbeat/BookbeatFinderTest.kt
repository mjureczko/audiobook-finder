package pl.marianjureczko.finder.port.bookbeat

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import pl.marianjureczko.finder.port.legimi.LegimiFinder

class BookbeatFinderTest {
    @Test
    fun testFinding() {
        //given
        val finder = BookbeatFinder()

        //when
        val actual = finder.findBook("Girl on Girl", "Girl on Girl", "Gilbert")

        //then
        assertEquals(2, actual.size)
        val expectedLink = "https://www"
        assertEquals(expectedLink, actual[0].link)
        assertEquals(expectedLink, actual[1].link)
        val actualSources = actual.map { it.sourceType }.toSet()
        assertEquals(finder.sourceTypes().toSet(), actualSources)
    }
}