package pl.marianjureczko.finder.storytell

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StorytellApi {
    @GET("/search/client/web")
    fun searchBookByTitle(
        @Query("query") title:String,
        @Query("store") store:String = "STHP-PL",
        @Query("searchFor") searchFor:String = "omni",
        @Query("includeFormats") includeFormats:String = "abook"
    ): Call<StorytellResponse>
}