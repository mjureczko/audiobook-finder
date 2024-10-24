package pl.marianjureczko.finder.port.audible

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class AudibleFinder : FinderTemplate<String>(listOf("Audible")) {

    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(AudibleApi.BASE_URL, converterFactory = ScalarsConverterFactory.create())
    private val api: AudibleApi = retrofit.create(AudibleApi::class.java)
    private val responseAnalyser = AudibleResponseAnalyser()

    override fun getRestCall(title: String): Call<String> =api.searchBookByTitle(title)

    override fun analyseResponse(resultBody: String, title: String, sourceType: String): String =
        responseAnalyser.execute(resultBody, title)
}