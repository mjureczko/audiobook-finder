package pl.marianjureczko.finder.bookbeat

import pl.marianjureczko.finder.Finder
import pl.marianjureczko.finder.Found
import retrofit2.Call
import retrofit2.Response

//TODO: move errorResponse and responseWithLink to Finder (???)
class BookbeatFinder : Finder {

    val sourceType = "Bookbeat"

    override fun findTitle(title: String): List<Found> {
        val call: Call<BookbeatResponse> = RetrofitClient.bookbeat.searchBookByTitle(title, title)
        try {
            val response: Response<BookbeatResponse> = call.execute()
            if (response.isSuccessful) {
                val resultBody: BookbeatResponse? = response.body()
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

    override fun sourceTypes(): List<String>  = listOf(sourceType)

    private fun analyseResponse(resultBody: BookbeatResponse?, title: String): String {
        return ResponseAnalyser().execute(resultBody, title)
    }

    private fun errorResponse(): List<Found> =  listOf(Found(sourceType, "ERROR"))

    private fun responseWithLink(link:String) = listOf(Found(sourceType, link))
}