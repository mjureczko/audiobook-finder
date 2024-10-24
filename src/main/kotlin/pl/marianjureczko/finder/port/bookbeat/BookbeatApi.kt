package pl.marianjureczko.finder.port.bookbeat

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookbeatApi {

    companion object{
        const val BASE_URL = "https://www.bookbeat.com"
    }
    /** The same value should be passed as query and title */
    @GET("/api/discovery/search")
    fun searchBookByTitle(
        @Query("query") query:String,
        @Query("title") title:String,
        @Query("format") format:String = "audiobook",
        @Query("language") language1:String = "polish",
        @Query("language") language2:String = "english",
        @Query("offset") offset:Int = 0,
        @Query("page") page:Int = 0,
    ): Call<BookbeatResponse>
}