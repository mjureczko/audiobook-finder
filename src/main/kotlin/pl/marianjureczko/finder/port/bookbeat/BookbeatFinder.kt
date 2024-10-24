package pl.marianjureczko.finder.port.bookbeat

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit

class BookbeatFinder : FinderTemplate<BookbeatResponse>(listOf("Bookbeat")) {

    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(BookbeatApi.BASE_URL)
    private val api: BookbeatApi = retrofit.create(BookbeatApi::class.java)
    private val responseAnalyser = BookbeatResponseAnalyser()

    override fun getRestCall(title: String): Call<BookbeatResponse> = api.searchBookByTitle(title, title)

    override fun analyseResponse(resultBody: BookbeatResponse, title: String, sourceType: String): String =
        responseAnalyser.execute(resultBody, title)
}