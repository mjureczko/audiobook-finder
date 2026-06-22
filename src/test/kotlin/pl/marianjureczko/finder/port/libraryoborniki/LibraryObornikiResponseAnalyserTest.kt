/*-
 * #%L
 * audiobook-finder
 * %%
 * Copyright (C) 2024 - 2026 Marian Jureczko
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
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
