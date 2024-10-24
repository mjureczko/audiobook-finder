package pl.marianjureczko.finder.port.audible

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AudibleApi {
    companion object {
        const val BASE_URL = "https://www.audible.com"
    }

    @GET("/search")
    fun searchBookByTitle(@Query("keywords") title:String): Call<String>
}