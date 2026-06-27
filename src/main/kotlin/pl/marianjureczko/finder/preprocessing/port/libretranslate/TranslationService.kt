package pl.marianjureczko.finder.preprocessing.port.libretranslate

import pl.marianjureczko.finder.rest.RetrofitHelper

class TranslationService(
    private val api: MyMemoryApi = RetrofitHelper.getLenientRetrofitClient(
        MyMemoryApi.BASE_URL
    ).create(MyMemoryApi::class.java)
) {
    fun translateTitle(title: String): TranslatedTitle {
        return try {
            // Request translations in both directions
            val englishTranslation = translate(title, "pl|en")
            val polishTranslation = translate(title, "en|pl")

            return TranslatedTitle(englishTranslation, polishTranslation)
        } catch (e: Exception) {
            e.printStackTrace()
            // If detection fails, use input title as both languages
            TranslatedTitle(title, title)
        }
    }

    private fun translate(title: String, direction: String): String {
        return try {
            val translationResponse = api.translate(title, direction).execute()
            if (translationResponse.isSuccessful) {
                translationResponse.body()?.responseData?.translatedText ?: title
            } else {
                title
            }
        } catch (e: Exception) {
            title
        }
    }
}

data class TranslatedTitle(
    val en: String,
    val pl: String
)