package pl.marianjureczko.finder.npl

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