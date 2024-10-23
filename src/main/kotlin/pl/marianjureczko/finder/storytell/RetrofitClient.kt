package pl.marianjureczko.finder.storytell

import okhttp3.OkHttpClient
import pl.marianjureczko.finder.rest.RetryInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://api.storytel.net"

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(RetryInterceptor(maxRetries = 4, backoffFactor = 1000L))
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
//        .addConverterFactory(ScalarsConverterFactory.create())
        .build()

    val storytell: StorytellApi = retrofit.create(StorytellApi::class.java)
}