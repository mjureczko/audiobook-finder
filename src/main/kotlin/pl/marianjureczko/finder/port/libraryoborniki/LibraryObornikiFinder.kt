package pl.marianjureczko.finder.port.libraryoborniki

import pl.marianjureczko.finder.Finder
import pl.marianjureczko.finder.Found
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.converter.scalars.ScalarsConverterFactory

class LibraryObornikiFinder : Finder {

    private val api = RetrofitHelper.getRetrofitClient(
        LibraryObornikiApi.BASE_URL,
        converterFactory = ScalarsConverterFactory.create()
    ).create(LibraryObornikiApi::class.java)

    private val responseAnalyser = LibraryObornikiResponseAnalyser()

    override fun sourceTypes() = listOf("LibraryOborniki")

    override fun findBook(titleEn: String, titlePl: String, author: String): List<Found> {
        return try {
            val response = api.search(titlePl, author, LibraryObornikiApi.SECTIONS, LibraryObornikiApi.LIBRARY_ID).execute()
            if (response.isSuccessful) {
                val link = response.body()?.let { responseAnalyser.execute(it, titlePl) } ?: ""
                listOf(Found("LibraryOborniki", link))
            } else {
                listOf(Found("LibraryOborniki", "ERROR"))
            }
        } catch (e: Exception) {
            e.printStackTrace()
            listOf(Found("LibraryOborniki", "ERROR"))
        }
    }
}