package pl.marianjureczko.finder.port.libraryoborniki.pl.marianjureczko.finder.port.libraryoborniki

import org.junit.jupiter.api.Test
import pl.marianjureczko.finder.port.libraryoborniki.LibraryObornikiResponseAnalyser
import java.io.File
import kotlin.test.assertTrue

class LibraryObornikiResponseAnalyserTest {

    @Test
    fun `should find book even with 0 available copies`() {
        //given
        val html = File("src/test/resources/oborniki_library_book_found.html").readText()
        val analyser = LibraryObornikiResponseAnalyser()

        //when
        val result = analyser.execute(html, "Kolekcjoner lalek")

        //then
        assertTrue(result.contains("http://szukamksiążki.pl"), "Book should be found even with 0 available copies")
    }
}
