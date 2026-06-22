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
            val englishTranslation = translateToEnglish(title)
            val polishTranslation = translateToPolish(title)

            return TranslatedTitle(englishTranslation, polishTranslation)
        } catch (e: Exception) {
            e.printStackTrace()
            // If detection fails, use input title as both languages
            TranslatedTitle(title, title)
        }
    }

    private fun translateToEnglish(title: String): String {
        return try {
            val translationResponse = api.translate(title, "pl|en").execute()
            if (translationResponse.isSuccessful) {
                translationResponse.body()?.responseData?.translatedText ?: title
            } else {
                title
            }
        } catch (e: Exception) {
            title
        }
    }

    private fun translateToPolish(title: String): String {
        return try {
            val translationResponse = api.translate(title, "en|pl").execute()
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