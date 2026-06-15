package pl.marianjureczko.finder

import pl.marianjureczko.finder.port.storytell.StorytellFinder
import kotlinx.coroutines.*
import pl.marianjureczko.finder.port.audible.AudibleFinder
import pl.marianjureczko.finder.port.audioteka.AudiotekaFinder
import pl.marianjureczko.finder.port.bookbeat.BookbeatFinder
import pl.marianjureczko.finder.port.legimi.LegimiFinder
import pl.marianjureczko.finder.port.oreilly.OreillyFinder

interface BookResultsHandler {
    fun consume(title: String, results: List<Found>)
}

class SearchExecutor {
    private val finders: List<Finder> = listOf(
        StorytellFinder(),
        BookbeatFinder(),
        AudibleFinder(),
        LegimiFinder(),
        AudiotekaFinder(),
        OreillyFinder()
    )

    fun sourceTypes(): List<String> = finders.flatMap { it.sourceTypes() }

    fun execute(books: List<Pair<String, String>>, consumer: BookResultsHandler) {
        books.forEach { (title, author) ->
            val allResults = mutableListOf<Found>()
            runBlocking {
                val deferredResults = finders.map { finder ->
                    async(Dispatchers.IO) {
                        finder.findBook(title, author)
                    }
                }
                deferredResults.forEach { deferred ->
                    allResults.addAll(deferred.await())
                }
            }
            consumer.consume(title, allResults)
            println("$title - DONE")
        }
    }
}