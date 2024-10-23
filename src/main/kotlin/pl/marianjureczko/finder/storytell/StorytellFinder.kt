package pl.marianjureczko.finder.storytell

import pl.marianjureczko.finder.Finder
import pl.marianjureczko.finder.Found
import retrofit2.Call
import retrofit2.Response

class StorytellFinder : Finder {

    val sourceType = "Storytell"

    override fun findTitle(title: String): List<Found> {
        val call: Call<StorytellResponse> = RetrofitClient.storytell.searchBookByTitle(title)
        try {
            val response: Response<StorytellResponse> = call.execute()
            if (response.isSuccessful) {
                val resultBody: StorytellResponse? = response.body()
                val link = analyseResponse(resultBody, title)
                return responseWithLink(link)
            } else {
                return errorResponse()
            }
        } catch (e: Exception) {
            return errorResponse()
        }
    }

    override fun sourceTypes(): List<String> = listOf(sourceType)

    private fun analyseResponse(resultBody: StorytellResponse?, title: String): String {
        return ResponseAnalyser().execute(resultBody, title)
    }

    private fun errorResponse(): List<Found> = listOf(Found(sourceType, "ERROR"))

    private fun responseWithLink(link:String) = listOf(Found(sourceType, link))
}