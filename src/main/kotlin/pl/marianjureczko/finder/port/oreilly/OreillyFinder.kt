package pl.marianjureczko.finder.port.oreilly

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit

const val OREILLY_BOOK = "O'Reilly book"
const val OREILLY_AUDIOBOOK = "O'Reilly audiobook"
class OreillyFinder: FinderTemplate<OreillyResponse>(
    listOf(OREILLY_BOOK, OREILLY_AUDIOBOOK)
) {
    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(OreillyApi.BASE_URL)
    private val api: OreillyApi = retrofit.create(OreillyApi::class.java)
    private val responseAnalyser: OreillyResponseAnalyser = OreillyResponseAnalyser()
    override fun getRestCall(title: String): Call<OreillyResponse> =
        api.searchBookByTitle("title:"+title)

    override fun analyseResponse(resultBody: OreillyResponse, title: String, sourceType: String): String {
        val expectedContent = if(OREILLY_BOOK == sourceType) {
            "book"
        } else {
            "audiobook"
        }
        return responseAnalyser.execute(resultBody, title, expectedContent)
    }
}