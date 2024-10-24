package pl.marianjureczko.finder.port.legimi

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit

private const val LEGIMI_AUDIOBOOK = "Legimi Audiobook"
private const val LEGIMI_EBOOK = "Legimi Ebook"

class LegimiFinder : FinderTemplate<LegimiResponse>(
    listOf(LEGIMI_AUDIOBOOK, LEGIMI_EBOOK)
) {
    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(
        LegimiApi.BASE_URL, listOf(
            BracketDecoderInterceptor()
        ))
    private val api: LegimiApi = retrofit.create(LegimiApi::class.java)
    private val responseAnalyser = LegimiResponseAnalyser()
    override fun getRestCall(title: String): Call<LegimiResponse> = api.searchBookByTitle(title)
    override fun analyseResponse(resultBody: LegimiResponse, title: String, sourceType: String): String {
        val filter: (Book) -> Boolean = {
            if (LEGIMI_AUDIOBOOK == sourceType) {
                it.audiobookFormat
            } else {
                it.ebookFormat
            }
        }
        return responseAnalyser.execute(resultBody, title, filter)
    }
}