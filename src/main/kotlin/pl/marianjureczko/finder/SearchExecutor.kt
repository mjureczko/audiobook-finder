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

    fun execute(titles: List<String>, consumer: BookResultsHandler) {
        titles.forEach { title ->
            val allResults = mutableListOf<Found>()
            runBlocking {
                val deferredResults = finders.map { finder ->
                    async(Dispatchers.IO) {
                        finder.findTitle(title) /* Perform the search asynchronously */
                    }
                }
                // Await all the results and aggregate them
                deferredResults.forEach { deferred ->
                    val result = deferred.await()
                    allResults.addAll(result)
                }

            }
            consumer.consume(title, allResults)
            println("$title - DONE")
        }
    }
}