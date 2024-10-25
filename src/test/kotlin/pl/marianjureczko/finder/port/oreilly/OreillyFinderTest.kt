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
