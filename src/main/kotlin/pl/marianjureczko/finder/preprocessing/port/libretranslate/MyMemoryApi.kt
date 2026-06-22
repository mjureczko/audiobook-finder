package pl.marianjureczko.finder.preprocessing.port.libretranslate

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MyMemoryApi {
    companion object {
        const val BASE_URL = "https://api.mymemory.translated.net"
    }

    @GET("/get")
    fun translate(
        @Query("q") text: String,
        @Query("langpair") languagePair: String
    ): Call<TranslationResponse>

    data class TranslationResponse(
        val responseData: ResponseData
    )

    data class ResponseData(
        val translatedText: String
    )
}