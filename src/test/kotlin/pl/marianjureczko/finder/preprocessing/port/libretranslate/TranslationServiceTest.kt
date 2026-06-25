/*-
 * #%L
 * audiobook-finder
 * %%
 * Copyright (C) 2024 - 2026 Marian Jureczko
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */
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
