package pl.marianjureczko.finder.preprocessing

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
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

        assertTrue(outputContent.contains("title_pl"), "Output should contain title_pl column")
        assertTrue(outputContent.contains("title_en"), "Output should contain title_en column")
        assertTrue(outputContent.contains("author"), "Output should contain author column")
        assertTrue(outputContent.contains("Adler-Olsen"), "Output should contain 1st author data")
        assertTrue(outputContent.contains("The Shadow Murders"), "Output should contain 1st english title")
        assertTrue(outputContent.contains("Kissinger"), "Output should contain 2nd author data")
        assertTrue(outputContent.contains("Diplomacy"), "Output should contain 2nd english title")
        assertTrue( outputContent.contains("Dyplomacja"), "Output should contain 2nd title polish")
    }
}
