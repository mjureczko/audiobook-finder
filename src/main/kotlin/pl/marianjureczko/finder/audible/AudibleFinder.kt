package pl.marianjureczko.finder.audible

import pl.marianjureczko.finder.Finder
import pl.marianjureczko.finder.Found
import retrofit2.Call
import retrofit2.Response

//TODO refactor to template method along with other finders
class AudibleFinder : Finder {

    val sourceType = "Audible"

    override fun findTitle(title: String): List<Found> {
        val call: Call<String> = RetrofitClient.audible.searchBookByTitle(title)
        try {
            val response: Response<String> = call.execute()
            if (response.isSuccessful) {
                val resultBody: String? = response.body()
                val link = analyseResponse(resultBody, title)
                return responseWithLink(link)
            } else {
                return errorResponse()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return errorResponse()
        }
    }

    private fun analyseResponse(resultBody: String?, title: String): String =
        resultBody?.let { ResponseAnalyser().execute(it, title) } ?: ""

    override fun sourceTypes(): List<String> = listOf(sourceType)

    private fun errorResponse(): List<Found> = listOf(Found(sourceType, "ERROR"))

    private fun responseWithLink(link: String) = listOf(Found(sourceType, link))
}