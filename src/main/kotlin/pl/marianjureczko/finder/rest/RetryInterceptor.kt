package pl.marianjureczko.finder.rest

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class RetryInterceptor( private val maxRetries: Int, private val backoffFactor: Long) : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        var attempt = 0
        var response: Response

        while (true) {
            response = chain.proceed(chain.request())
            if (response.isSuccessful) {
                return response
            }
            attempt++
            if (attempt > maxRetries) {
                throw IOException("Max retries reached")
            }
            // Wait before retrying
            Thread.sleep(backoffFactor * attempt)
        }
    }
}