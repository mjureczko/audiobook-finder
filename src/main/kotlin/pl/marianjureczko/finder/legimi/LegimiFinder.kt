package pl.marianjureczko.finder.legimi

import pl.marianjureczko.finder.Finder
import pl.marianjureczko.finder.Found
import retrofit2.Call
import retrofit2.Response

class LegimiFinder : Finder {
    val sourceTypeAudiobook = "Legimi Audiobook"
    val sourceTypeEbook = "Legimi Ebook"

    override fun findTitle(title: String): List<Found> {
        val call: Call<LegimiResponse> = RetrofitClient.legimi.searchBookByTitle(title)
        try {
            val response: Response<LegimiResponse> = call.execute()
            if (response.isSuccessful) {
                val resultBody: LegimiResponse? = response.body()
                val audiobook = Found(sourceTypeAudiobook, analyseResponse(resultBody, title, sourceTypeAudiobook))
                val ebook = Found(sourceTypeEbook, analyseResponse(resultBody, title, sourceTypeEbook))
                return listOf(audiobook, ebook)
            } else {
                return errorResponse()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return errorResponse()
        }
    }

    override fun sourceTypes(): List<String> = listOf(sourceTypeAudiobook, sourceTypeEbook)

    private fun analyseResponse(resultBody: LegimiResponse?, title: String, sourceTypeAudiobook: String): String {
        val filter: (Book) -> Boolean = {
            if (this.sourceTypeAudiobook == sourceTypeAudiobook) {
                it.audiobookFormat
            } else {
                it.ebookFormat
            }
        }
        return resultBody?.let { ResponseAnalyser().execute(resultBody, title, filter) } ?: ""
    }

    private fun errorResponse(): List<Found> = listOf(
        Found(sourceTypeAudiobook, "ERROR"),
        Found(sourceTypeEbook, "ERROR")
    )
}