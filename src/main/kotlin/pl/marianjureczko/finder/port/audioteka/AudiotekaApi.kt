package pl.marianjureczko.finder.port.audioteka

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AudiotekaApi {
    companion object {
        const val BASE_URL = "https://audioteka.com"
    }

    @GET("/_next/data/{hash}/pl/szukaj/{query}.json")
    fun searchBookByTitle(
        @Path("hash") hash: String,
        @Path("query") query: String
    ): Call<AudiotekaResponse>
}