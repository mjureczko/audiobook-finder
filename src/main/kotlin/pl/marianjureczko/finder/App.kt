package pl.marianjureczko.finder

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import pl.marianjureczko.finder.preprocessing.InputPreprocessor
import java.nio.file.Files
import java.nio.file.Paths
import java.io.BufferedWriter
import java.io.FileWriter
import org.apache.commons.csv.CSVPrinter

const val INPUT_FILE = "books.csv"
const val PREPROCESSED_FILE = "books2.csv"
const val OUTPUT_FILE = "search.csv"

private const val TITLE = "title"
private const val AUTHOR = "author"

fun main() {
    // Step 1: Preprocess the input books
    val preprocessor = InputPreprocessor()
    preprocessor.preprocessBooks()

    // Step 2: Load preprocessed books and search using English titles
    val books = loadPreprocessedBooks()
    val executor = SearchExecutor()

    val headers = executor.sourceTypes()
    val csvFormat = createCsvFormat(headers)

    BufferedWriter(FileWriter(OUTPUT_FILE)).use { writer ->
        val csvPrinter = CSVPrinter(writer, csvFormat)
        executor.execute(books, object: BookResultsHandler {
            override fun consume(title: String, results: List<Found>) {
                val resultsByType = results.associateBy { it.sourceType }
                val record = listOf(title) + headers.map { resultsByType[it]?.link ?:"" }
                csvPrinter.printRecord(record)
                csvPrinter.flush()
            }
        })
    }

}

private fun createCsvFormat(headers: List<String>): CSVFormat? {
    val formatBuilder = CSVFormat.Builder.create()
    val allHeaders = (listOf(TITLE) + headers).toTypedArray()
    formatBuilder.setHeader(*allHeaders)
    return formatBuilder.build()
}

private fun loadPreprocessedBooks(): List<PreprocessedBook> {
    val books = mutableListOf<PreprocessedBook>()
    Files.newBufferedReader(Paths.get(PREPROCESSED_FILE)).use { reader ->
        val csvParser = CSVParser(reader, CSVFormat.DEFAULT.withSkipHeaderRecord())
        for (csvRecord in csvParser) {
            val titlePl = csvRecord.get("title_pl")
            val titleEn = csvRecord.get("title_en")
            val author = runCatching { csvRecord.get("author") }.getOrDefault("")
            books.add(PreprocessedBook(titlePl, titleEn, author))
        }
    }
    return books
}
