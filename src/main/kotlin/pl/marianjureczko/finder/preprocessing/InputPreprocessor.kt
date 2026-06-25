package pl.marianjureczko.finder.preprocessing

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVPrinter
import pl.marianjureczko.finder.CSV_HEADER_AUTHOR
import pl.marianjureczko.finder.CSV_HEADER_ORIGINAL_TITLE
import pl.marianjureczko.finder.CSV_HEADER_TITLE
import pl.marianjureczko.finder.CSV_HEADER_TITLE_EN
import pl.marianjureczko.finder.CSV_HEADER_TITLE_PL
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
                val originalTitle = csvRecord.get(CSV_HEADER_TITLE)
                val author = runCatching { csvRecord.get(CSV_HEADER_AUTHOR) }.getOrDefault("")

                // Clean the title by removing brackets
                val cleanedTitle = removeBrackets(originalTitle)

                // Use LibreTranslate to get both Polish and English versions
                val (polishTitle, englishTitle) = translationService.translateTitle(cleanedTitle)

                // Extract author surname for better search results
                val authorSurname = extractAuthorSurname(author)

                books.add(
                    PreprocessedBook(
                        titlePl = polishTitle,
                        titleEn = englishTitle,
                        originalTitle = originalTitle,
                        author = authorSurname
                    )
                )
            }
        }
        return books
    }

    private fun savePreprocessedBooks(books: List<PreprocessedBook>, outputFile: String) {
        BufferedWriter(FileWriter(outputFile)).use { writer ->
            val csvPrinter = CSVPrinter(
                writer, CSVFormat.DEFAULT
                    .withHeader(CSV_HEADER_TITLE_PL, CSV_HEADER_TITLE_EN, CSV_HEADER_ORIGINAL_TITLE, CSV_HEADER_AUTHOR)
            )
            for (book in books) {
                csvPrinter.printRecord(book.titlePl, book.titleEn, book.originalTitle, book.author)
            }
            csvPrinter.flush()
        }
    }

    private fun removeBrackets(text: String): String =
        text.replace(Regex("""\([^)]*\)"""), "").replace(Regex("""\s+"""), " ").trim()

    private fun extractAuthorSurname(author: String): String {
        return author.substringBefore(",").trim()
    }
}
