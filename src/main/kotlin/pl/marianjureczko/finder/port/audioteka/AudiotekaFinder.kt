package pl.marianjureczko.finder.port.audioteka

import pl.marianjureczko.finder.FinderTemplate
import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Call
import retrofit2.Retrofit

const val AUDIOTEKA = "Audioteka"
const val KLUB = "Audioteka Klub"

class AudiotekaFinder : FinderTemplate<AudiotekaResponse>(listOf(AUDIOTEKA, KLUB)) {

    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(AudiotekaApi.BASE_URL)
    private val api: AudiotekaApi = retrofit.create(AudiotekaApi::class.java)
    private val responseAnalyser: AudiotekaResponseAnalyser = AudiotekaResponseAnalyser()

    override fun getRestCall(title: String): Call<AudiotekaResponse> = api.searchBookByTitle(title)

    override fun analyseResponse(resultBody: AudiotekaResponse, title: String, sourceType: String): String =
        responseAnalyser.execute(resultBody, title, KLUB == sourceType)
}