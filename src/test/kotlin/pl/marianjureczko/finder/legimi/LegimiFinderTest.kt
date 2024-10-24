package pl.marianjureczko.finder.legimi

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LegimiFinderTest {
    @Test
    fun testFinding() {
        //given
        val finder = LegimiFinder()

        //when
        val actual = finder.findTitle("Dziennik pokojówki")

        //then
        assertEquals(2, actual.size)
        val expectedLink = "https://www.legimi.pl/ebook-dziennik-pokojowki-loreth-anne-white,b1278829.html"
        assertEquals(expectedLink, actual[0].link)
        assertEquals(expectedLink, actual[1].link)
        val actualSources = actual.map { it.sourceType }.toSet()
        assertEquals(finder.sourceTypes().toSet(), actualSources)
    }
}