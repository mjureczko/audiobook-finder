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
