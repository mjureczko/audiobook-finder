package pl.marianjureczko.input

import java.io.File
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.BufferedWriter
import java.io.FileWriter
import org.jsoup.Jsoup

data class Book(val title: String, val author: String)

val CSV_FORMAT = CSVFormat.Builder.create().setHeader("title", "author").build()

fun main() {
    val books = extractBooks()
    saveToCsv(books)
}

fun extractBooks(): List<Book> {
    val doc = Jsoup.parse(File("books.html"))
    val rows = doc.select("tr.bookalike.review")
    return rows.mapNotNull { row ->
        val title = row.selectFirst("td.field.title a[title]")?.attr("title") ?: return@mapNotNull null
        val authors = row.select("td.field.author a[href*=/author/show/]")
            .joinToString(", ") { it.text().trim() }
        if (authors.isEmpty()) return@mapNotNull null
        Book(title, authors)
    }
}

fun saveToCsv(books: List<Book>) {
    val fileName = "books.csv"
    BufferedWriter(FileWriter(fileName)).use { writer ->
        val csvPrinter = CSVPrinter(writer, CSV_FORMAT)
        books.forEach { csvPrinter.printRecord(it.title, it.author) }
        csvPrinter.flush()
    }
}