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
package pl.marianjureczko.finder.port.storytell

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import pl.marianjureczko.finder.port.oreilly.OREILLY_AUDIOBOOK
import pl.marianjureczko.finder.port.oreilly.OREILLY_BOOK
import pl.marianjureczko.finder.port.storytell.StorytellFinder

class StorytellFinderTest {
    @Test
    fun storytell() {
        //given
        val finder = StorytellFinder()

        //when
        val actual = finder.findBook("Red dragon", "czerwony smok", "Harris")

        //then
        assertEquals(1, actual.size)
        assertEquals("Storytell", actual[0].sourceType)
        assertEquals("https://www.storytel.com/pl/books/red-dragon-212173?utm_source=internal&utm_medium=app_link&utm_campaign=share_links", actual[0].link)
    }
}
