package pl.marianjureczko.finder.rest

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitHelper {

    private val loggingInterceptor: Interceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    fun getRetrofitClient(
        baseUrl: String,
        additionalInterceptors: List<Interceptor> = emptyList(),
        converterFactory: Converter.Factory = GsonConverterFactory.create()
    ): Retrofit {

        val okHttpClientBuilder = OkHttpClient.Builder()
            .addInterceptor(RetryInterceptor(maxRetries = 4, backoffFactor = 15001L))
            .addInterceptor(loggingInterceptor)
        additionalInterceptors.forEach { okHttpClientBuilder.addInterceptor(it) }
        val okHttpClient = okHttpClientBuilder.build()

        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(converterFactory)
            .build()
    }
}