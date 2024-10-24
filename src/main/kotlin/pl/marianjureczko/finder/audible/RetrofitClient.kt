package pl.marianjureczko.finder.audible

import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitClient {
    const val BASE_URL = "https://www.audible.com"
    private val retrofit: Retrofit = getRetrofitClient(BASE_URL)

    val audible: AudibleApi = retrofit.create(AudibleApi::class.java)

    //TODO: copied from RetrofitHelper
    fun getRetrofitClient(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(RetrofitHelper.okHttpClient)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }
}