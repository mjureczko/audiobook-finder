package pl.marianjureczko.finder.preprocessing.port.libretranslate

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TranslationServiceTest {

    @Test
    fun testDiplomacyTranslation() {
        // given
        val translationService = TranslationService()
        val englishTitle = "Diplomacy"

        // when
        val result = translationService.translateTitle(englishTitle)

        // Then
        assertEquals(englishTitle, result.en)
        assertEquals("Dyplomacja", result.pl)
    }

    @Test
    fun testPolishTitleTranslation() {
        //given
        val translationService = TranslationService()

        // when
        val polishTitle = "Dyplomacja"
        val result = translationService.translateTitle(polishTitle)

        // then
        assertEquals(polishTitle, result.pl)
        assertEquals("Diplomacy", result.en)
    }

    @Test
    fun testUnknownLanguageFallback() {
        //given
        val translationService = TranslationService()
        val russianTitle = "Привет мир"

        // when
        val result = translationService.translateTitle(russianTitle)

        // then
        assertEquals(result.en, russianTitle)
        assertEquals(result.pl, russianTitle)
    }
}
