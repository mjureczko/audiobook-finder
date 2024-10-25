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
package pl.marianjureczko.finder.nlp

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TitleComparatorTest {
    @Test
    fun compareTitles() {
        val a = "Red Dragon"
        val b = "The Red Dragon"
        val comparator = TitleComparator()

        //when
        val actual = comparator.similarity(a, b)

        //then
        assertEquals(0.9999, actual, 0.0001)
    }
}
