package pl.marianjureczko.finder

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import pl.marianjureczko.finder.preprocessing.InputPreprocessor
import java.nio.file.Files
import java.nio.file.Paths

const val INPUT_FILE = "books.csv"
const val PREPROCESSED_FILE = "books2.csv"
const val OUTPUT_FILE = "search.csv"

private const val TITLE = "title"
private const val AUTHOR = "author"

fun main() {
    // Step 1: Preprocess the input books
    val preprocessor = InputPreprocessor()
    preprocessor.preprocessBooks()

    // Step 2: Load preprocessed books (using Polish titles for now)
    val fileName = OUTPUT_FILE
//    val books = loadPreprocessedBooks()
//    val executor = SearchExecutor()
//
//    val headers = executor.sourceTypes()
//    val csvFormat = createCsvFormat(headers)
//
//    BufferedWriter(FileWriter(fileName)).use { writer ->
//        val csvPrinter = CSVPrinter(writer, csvFormat)
//        executor.execute(books, object: BookResultsHandler {
//            override fun consume(title: String, results: List<Found>) {
//                val resultsByType = results.associateBy { it.sourceType }
//                val record = listOf(title) + headers.map { resultsByType[it]?.link ?:"" }
//                csvPrinter.printRecord(record)
//                csvPrinter.flush()
//            }
//        })
//    }

}

private fun createCsvFormat(headers: List<String>): CSVFormat? {
    val formatBuilder = CSVFormat.Builder.create()
    val allHeaders = (listOf(TITLE) + headers).toTypedArray()
    formatBuilder.setHeader(*allHeaders)
    return formatBuilder.build()
}

private fun loadPreprocessedBooks(): List<Pair<String, String>> {
    val books = mutableListOf<Pair<String, String>>()
    Files.newBufferedReader(Paths.get(PREPROCESSED_FILE)).use { reader ->
        val csvParser = CSVParser(reader, CSVFormat.DEFAULT.withSkipHeaderRecord())
        for (csvRecord in csvParser) {
            // Use Polish title for now (title_pl), author remains the same
            val title = csvRecord.get("title_pl")
            val author = runCatching { csvRecord.get("author") }.getOrDefault("")
            books.add(title to author)
        }
    }
    return books
}
