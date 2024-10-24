package pl.marianjureczko.finder.port.oreilly

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface OreillyApi {
    companion object{
        const val BASE_URL = "https://learning.oreilly.com"
        private val DEFAULT_FORMATS = listOf("audiobook", "book")
    }

    @GET("/api/v2/search")
    fun searchBookByTitle(
        @Query("query") query: String,
        @Query("formats") formats: List<String> = DEFAULT_FORMATS
    ): Call<OreillyResponse>
}