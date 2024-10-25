/*-
 * #%L
 * audiobook-finder
 * %%
 * Copyright (C) 2024 Marian Jureczko
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
package pl.marianjureczko.finder.port.legimi

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pl.marianjureczko.finder.port.legimi.LegimiFinder

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
