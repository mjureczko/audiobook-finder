package pl.marianjureczko.finder.port.audioteka

import com.google.gson.annotations.SerializedName
import pl.marianjureczko.finder.nlp.SimpleBook

data class AudiotekaResponse(
    val pageProps: PageProps?
)

data class PageProps(
    val firstPage: FirstPage?
)

data class FirstPage(
    val embedded: Embedded?
)

data class Embedded(
    @SerializedName("app:product")
    val product: List<Product>?
)

data class Product(
    val data: Book?
)

data class Book(
    val name: String,
    val is_free: Boolean?,
    val is_available_in_subscription: Boolean?,
    val deeplink: String
) : SimpleBook {
    override fun title(): String = name

    override fun link(): String = deeplink
}