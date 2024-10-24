package pl.marianjureczko.finder

import retrofit2.Call
import retrofit2.Response

abstract class FinderTemplate<T>(
    private val sourceTypes: List<String>
) : Finder {
    protected abstract fun getRestCall(title: String): Call<T>
    protected abstract fun analyseResponse(resultBody: T, title: String, sourceType: String): String

    override fun findTitle(title: String): List<Found> {
        val call: Call<T> = getRestCall(title)
        try {
            val response: Response<T> = call.execute()
            if (response.isSuccessful) {
                val resultBody: T? = response.body()
                return sourceTypes
                    .map { sourceType ->
                        val link = resultBody?.let { analyseResponse(it, title, sourceType) } ?: ""
                        Found(sourceType, link)
                    }
            } else {
                return errorResponse()
            }
        } catch (e: Exception) {
            return errorResponse()
        }
    }

    override fun sourceTypes(): List<String> = sourceTypes

    private fun errorResponse(): List<Found> = sourceTypes.map { sourceType -> Found(sourceType, "ERROR") }
}