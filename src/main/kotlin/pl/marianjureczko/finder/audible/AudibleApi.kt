package pl.marianjureczko.finder.audible

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AudibleApi {
    @GET("/search")
    fun searchBookByTitle(@Query("keywords") title:String): Call<String>
}