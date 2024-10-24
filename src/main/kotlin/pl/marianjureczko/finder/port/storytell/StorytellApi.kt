package pl.marianjureczko.finder.port.storytell

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StorytellApi {
    companion object{
        const val BASE_URL = "https://api.storytel.net"
    }
    @GET("/search/client/web")
    fun searchBookByTitle(
        @Query("query") title:String,
        @Query("store") store:String = "STHP-PL",
        @Query("searchFor") searchFor:String = "omni",
        @Query("includeFormats") includeFormats:String = "abook"
    ): Call<StorytellResponse>
}