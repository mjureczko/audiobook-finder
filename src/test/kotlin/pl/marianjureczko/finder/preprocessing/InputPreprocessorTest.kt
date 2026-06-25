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
package pl.marianjureczko.finder.preprocessing

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import pl.marianjureczko.finder.CSV_HEADER_AUTHOR
import pl.marianjureczko.finder.CSV_HEADER_TITLE_EN
import pl.marianjureczko.finder.CSV_HEADER_TITLE_PL
import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.assertTrue

class InputPreprocessorTest {

    @Test
    fun testPreprocessingStructure(@TempDir tempDir: Path) {
        // given
        val inputFile = tempDir.resolve("test_input.csv")
        val inputContent = """title,author
"The Shadow Murders","Adler-Olsen, Jussi"
Diplomacy,"Kissinger, Henry"
""".trimIndent()
        Files.write(inputFile, inputContent.toByteArray())

        val outputFile = tempDir.resolve("test_output.csv")
        val preprocessor = InputPreprocessor()

        // when
        preprocessor.preprocessBooks(inputFile.toString(), outputFile.toString())

        // then
        assertTrue(Files.exists(outputFile), "Output file should be created")
        val outputContent = Files.readString(outputFile)

        assertTrue(outputContent.contains(CSV_HEADER_TITLE_PL), "Output should contain title_pl column")
        assertTrue(outputContent.contains(CSV_HEADER_TITLE_EN), "Output should contain title_en column")
        assertTrue(outputContent.contains(CSV_HEADER_AUTHOR), "Output should contain author column")
        assertTrue(outputContent.contains(",Adler-Olsen\r\n"), "Output should contain 1st author data")
        assertTrue(outputContent.contains("The Shadow Murders"), "Output should contain 1st english title")
        assertTrue(outputContent.contains(",Kissinger\r\n"), "Output should contain 2nd author data")
        assertTrue(outputContent.contains("Diplomacy"), "Output should contain 2nd english title")
        assertTrue( outputContent.contains("Dyplomacja"), "Output should contain 2nd title polish")
    }
}
