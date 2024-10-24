package pl.marianjureczko.finder.legimi

import okhttp3.OkHttpClient
import pl.marianjureczko.finder.rest.RetrofitHelper.loggingInterceptor
import pl.marianjureczko.finder.rest.RetryInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    const val BASE_URL = "https://www.legimi.pl"

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(RetryInterceptor(maxRetries = 4, backoffFactor = 1000L))
        .addInterceptor(loggingInterceptor)
        .addInterceptor(BracketDecoderInterceptor())
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val legimi: LegimiApi = retrofit.create(LegimiApi::class.java)
}