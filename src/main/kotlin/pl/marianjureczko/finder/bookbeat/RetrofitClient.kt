package pl.marianjureczko.finder.bookbeat

import pl.marianjureczko.finder.rest.RetrofitHelper
import retrofit2.Retrofit

object RetrofitClient {
    private const val BASE_URL = "https://www.bookbeat.com"
    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(BASE_URL)

    val bookbeat: BookbeatApi = retrofit.create(BookbeatApi::class.java)
}