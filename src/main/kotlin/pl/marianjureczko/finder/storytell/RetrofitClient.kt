package pl.marianjureczko.finder.storytell

import okhttp3.OkHttpClient
import pl.marianjureczko.finder.rest.RetrofitHelper
import pl.marianjureczko.finder.rest.RetryInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://api.storytel.net"
    private val retrofit: Retrofit = RetrofitHelper.getRetrofitClient(BASE_URL)

    val storytell: StorytellApi = retrofit.create(StorytellApi::class.java)
}