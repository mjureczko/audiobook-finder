package pl.marianjureczko.finder.port.libraryoborniki

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LibraryObornikiApi {
    companion object {
        const val BASE_URL = "http://szukamksiążki.pl/"
        const val LIBRARY_ID = "858"
        val SECTIONS = listOf("k", "b", "f", "w", "d", "s", "i", "g", "n", "e", "m")
    }

    @GET("SkNewWeb/search")
    fun search(
        @Query("tytul") title: String,
        @Query("autor") author: String,
        @Query("sekcja") sections: List<String>,
        @Query("id_authorize") libraryId: String
    ): Call<String>
}