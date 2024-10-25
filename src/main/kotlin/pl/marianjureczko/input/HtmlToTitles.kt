package pl.marianjureczko.input

import java.io.File
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.BufferedWriter
import java.io.FileWriter

val CSV_FORMAT = CSVFormat.Builder.create().setHeader("title").build()

fun main() {
    val extractedTitles = extractTitles()
    saveToCsv(extractedTitles)
}

fun extractTitles(): List<String> {
    val htmlContent: String = File("books.html").readText()
    val regex = Regex("""<label>title<\/label>.*?<a title="(.*?)"""")
    val matches = regex.findAll(htmlContent)
    return matches
        .map { it.groupValues[1].replace(Regex("&[a-zA-Z]{1,5};"), "") }
        .toList()
}


fun saveToCsv(extractedTitles: List<String>) {
    val fileName = "books.csv"
    BufferedWriter(FileWriter(fileName)).use { writer ->
        val csvPrinter = CSVPrinter(writer, CSV_FORMAT)
        extractedTitles.forEach{csvPrinter.printRecord(it)}
        csvPrinter.flush()
    }
}
