package pl.marianjureczko.finder.port.legimi

import okhttp3.Interceptor
import okhttp3.Response

class BracketDecoderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder()
            .query(request.url.query?.replace("%5B", "[")?.replace("%5D", "]"))
            .build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}