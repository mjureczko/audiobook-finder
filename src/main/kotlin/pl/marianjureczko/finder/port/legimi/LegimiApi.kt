package pl.marianjureczko.finder.port.legimi

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LegimiApi {

    companion object {
        const val BASE_URL = "https://www.legimi.pl"
        private const val DEFAULT_FILTERS = "[\"audiobooks\",\"ebooks\",\"epub\",\"mobi\",\"pdf\",\"unlimited\",\"unlimitedlegimi\"]"
        private const val DEFAULT_LANGUAGES = "[\"english\",\"polish\"]"
    }
    @GET("/api/catalogue")
    fun searchBookByTitle(
        @Query("searchphrase") title:String,
        @Query("filters") filters:String = DEFAULT_FILTERS,
        @Query("languages") languages:String = DEFAULT_LANGUAGES,
        @Query("sort") sort:String = "score",
    ): Call<LegimiResponse>
}