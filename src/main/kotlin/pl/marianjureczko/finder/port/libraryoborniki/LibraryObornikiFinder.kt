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

    override fun findTitle(title: String) = findBook(title, "")

    override fun findBook(title: String, author: String): List<Found> {
        val surname = author.substringBefore(",").trim()
        return try {
            val response = api.search(title, surname, LibraryObornikiApi.SECTIONS, LibraryObornikiApi.LIBRARY_ID).execute()
            if (response.isSuccessful) {
                val link = response.body()?.let { responseAnalyser.execute(it, title) } ?: ""
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