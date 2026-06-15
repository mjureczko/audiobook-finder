package pl.marianjureczko.finder

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import org.apache.commons.csv.CSVPrinter
import pl.marianjureczko.input.CSV_FORMAT
import java.io.BufferedWriter
import java.io.FileWriter
import java.nio.file.Files
import java.nio.file.Paths

private const val TITLE = "title"
private const val AUTHOR = "author"

fun main() {
    val fileName = "search.csv"
    val books = loadBooksFromCsv()
    val executor = SearchExecutor()

    val headers = executor.sourceTypes()
    val csvFormat = createCsvFormat(headers)

    BufferedWriter(FileWriter(fileName)).use { writer ->
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

private fun loadBooksFromCsv(): List<Pair<String, String>> {
    val csvFilePath = "books.csv"
    val books = mutableListOf<Pair<String, String>>()
    Files.newBufferedReader(Paths.get(csvFilePath)).use { reader ->
        val csvParser = CSVParser(reader, CSV_FORMAT.withSkipHeaderRecord())
        for (csvRecord in csvParser) {
            val title = csvRecord.get(TITLE)
            val author = runCatching { csvRecord.get(AUTHOR) }.getOrDefault("")
            books.add(title to author)
        }
    }
    return books
}