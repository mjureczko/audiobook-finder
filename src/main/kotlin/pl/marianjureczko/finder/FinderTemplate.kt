package pl.marianjureczko.finder

import retrofit2.Call
import retrofit2.Response

abstract class FinderTemplate<T>(
    private val sourceTypes: List<String>
) : Finder {
    protected abstract fun getRestCall(title: String): Call<T>
    protected abstract fun analyseResponse(resultBody: T, title: String, sourceType: String, author: String): String

    override fun findBook(titleEn: String, titlePl: String, author: String): List<Found> {
        val call: Call<T> = getRestCall(titleEn)
        try {
            val response: Response<T> = call.execute()
            if (response.isSuccessful) {
                val resultBody: T? = response.body()
                return sourceTypes
                    .map { sourceType ->
                        val link = resultBody?.let { analyseResponse(it, titleEn, sourceType, author) } ?: ""
                        Found(sourceType, link)
                    }
            } else {
                return errorResponse()
            }
        } catch (e: Exception) {
            e.printStackTrace()
            return errorResponse()
        }
    }

    override fun sourceTypes(): List<String> = sourceTypes

    private fun errorResponse(): List<Found> = sourceTypes.map { sourceType -> Found(sourceType, "ERROR") }
}