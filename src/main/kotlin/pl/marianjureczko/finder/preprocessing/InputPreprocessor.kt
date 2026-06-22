package pl.marianjureczko.finder.preprocessing

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVPrinter
import pl.marianjureczko.finder.INPUT_FILE
import pl.marianjureczko.finder.PREPROCESSED_FILE
import pl.marianjureczko.finder.preprocessing.port.libretranslate.TranslationService
import pl.marianjureczko.input.CSV_FORMAT
import pl.marianjureczko.finder.PreprocessedBook
import java.io.BufferedWriter
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths

class InputPreprocessor {
    private val translationService = TranslationService()

    fun preprocessBooks(inputFile: String = INPUT_FILE, outputFile: String = PREPROCESSED_FILE) {
        val books = loadWithTitleTranslation(inputFile)
        savePreprocessedBooks(books, outputFile)
    }

    private fun loadWithTitleTranslation(inputFile: String): List<PreprocessedBook> {
        val books = mutableListOf<PreprocessedBook>()
        Files.newBufferedReader(Paths.get(inputFile)).use { reader ->
            val csvParser = CSVParser(reader, CSV_FORMAT.withSkipHeaderRecord())
            for (csvRecord in csvParser) {
                val originalTitle = csvRecord.get("title")
                val author = runCatching { csvRecord.get("author") }.getOrDefault("")

                // Clean the title by removing brackets
                val cleanedTitle = removeBrackets(originalTitle)

                // Use LibreTranslate to get both Polish and English versions
                val (polishTitle, englishTitle) = translationService.translateTitle(cleanedTitle)

                books.add(PreprocessedBook(
                    titlePl = polishTitle,
                    titleEn = englishTitle,
                    author = author
                ))
            }
        }
        return books
    }

    private fun savePreprocessedBooks(books: List<PreprocessedBook>, outputFile: String) {
        BufferedWriter(FileWriter(outputFile)).use { writer ->
            val csvPrinter = CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("title_pl", "title_en", "author"))
            for (book in books) {
                csvPrinter.printRecord(book.titlePl, book.titleEn, book.author)
            }
            csvPrinter.flush()
        }
    }

    private fun removeBrackets(text: String): String =
        text.replace(Regex("""\([^)]*\)"""), "").replace(Regex("""\s+"""), " ").trim()
}