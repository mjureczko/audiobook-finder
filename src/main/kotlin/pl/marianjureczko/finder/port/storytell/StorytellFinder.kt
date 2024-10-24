package pl.marianjureczko.finder.port.storytell

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit

class StorytellFinder : FinderTemplate<StorytellResponse>(listOf("Storytell")) {

    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(StorytellApi.BASE_URL)
    private val api: StorytellApi = retrofit.create(StorytellApi::class.java)
    private val responseAnalyser = StorytellResponseAnalyser()

    override fun getRestCall(title: String): Call<StorytellResponse> {
        return api.searchBookByTitle(title)
    }

    override fun analyseResponse(resultBody: StorytellResponse, title: String, sourceType: String): String {
        return responseAnalyser.execute(resultBody, title)
    }
}