package pl.marianjureczko.finder

import pl.marianjureczko.finder.port.storytell.StorytellFinder
import kotlinx.coroutines.*
import pl.marianjureczko.finder.port.audible.AudibleFinder
import pl.marianjureczko.finder.port.audioteka.AudiotekaFinder
import pl.marianjureczko.finder.port.bookbeat.BookbeatFinder
import pl.marianjureczko.finder.port.legimi.LegimiFinder
import pl.marianjureczko.finder.port.libraryoborniki.LibraryObornikiFinder
import pl.marianjureczko.finder.port.oreilly.OreillyFinder

interface BookResultsHandler {
    fun consume(title: String, results: List<Found>)
}

class SearchExecutor {
    private val finders: List<Finder> = listOf(
        StorytellFinder(),

        // neds update, API has changed
//        BookbeatFinder(),

        // neds update, a redirect has been added
//        AudibleFinder(),

        LegimiFinder(),

        AudiotekaFinder(),

        OreillyFinder(),

        LibraryObornikiFinder()
    )

    fun sourceTypes(): List<String> = finders.flatMap { it.sourceTypes() }

    fun execute(books: List<PreprocessedBook>, consumer: BookResultsHandler) {
        books.forEach { book ->
            val allResults = mutableListOf<Found>()
            runBlocking {
                val deferredResults = finders.map { finder ->
                    async(Dispatchers.IO) {
                        finder.findBook(book.titleEn, book.titlePl, book.author)
                    }
                }
                deferredResults.forEach { deferred ->
                    allResults.addAll(deferred.await())
                }
            }
            consumer.consume(book.originalTitle, allResults)
            println("${book.originalTitle} - DONE")
        }
    }
}