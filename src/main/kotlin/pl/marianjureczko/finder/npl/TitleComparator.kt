package pl.marianjureczko.finder.npl

import opennlp.tools.stemmer.PorterStemmer
import opennlp.tools.tokenize.SimpleTokenizer

class TitleComparator {

    private val EN_STOP_WORDS = setOf(
        "a", "about", "above", "after", "again", "against", "all", "am", "an", "and",
        "any", "are", "aren’t", "as", "at", "be", "because", "been", "before", "being",
        "below", "between", "both", "but", "by", "can", "can’t", "cannot", "could",
        "could’ve", "couldn’t", "did", "didn’t", "do", "doesn’t", "doing", "don’t",
        "down", "during", "each", "few", "for", "from", "further", "had", "hadn’t",
        "has", "hasn’t", "have", "haven’t", "having", "he", "he’d", "he’ll", "he’s",
        "her", "here", "here’s", "hers", "herself", "him", "himself", "his", "how",
        "how’s", "I", "I’d", "I’ll", "I’m", "I’ve", "if", "in", "into", "is", "isn’t",
        "it", "it’s", "its", "itself", "just", "keep", "me", "might", "might’ve",
        "mightn’t", "more", "most", "must", "must’ve", "mustn’t", "my", "myself",
        "needn’t", "no", "nor", "not", "of", "off", "on", "once", "only", "or",
        "other", "our", "ours", "ourselves", "out", "over", "own", "same", "say",
        "says", "she", "she’d", "she’ll", "she’s", "should", "should’ve", "shouldn’t",
        "so", "some", "such", "t", "than", "that", "that’s", "the", "their", "theirs",
        "them", "themselves", "then", "there", "there’s", "these", "they", "they’d",
        "they’ll", "they’re", "they’ve", "this", "those", "through", "to", "too",
        "under", "until", "up", "use", "very", "was", "wasn’t", "we", "we’d", "we’ll",
        "we’re", "we’ve", "were", "weren’t", "what", "what’s", "when", "when’s",
        "where", "where’s", "which", "while", "who", "who’s", "whom", "why", "why’s",
        "will", "with", "won’t", "would", "would’ve", "wouldn’t", "you", "you’d",
        "you’ll", "you’re", "you’ve", "your", "yours", "yourself", "yourselves"
    )
    private val PL_STOP_WORDS = setOf(
        "a", "aby", "ale", "albo", "am", "ani", "bądź", "by", "być", "czemu",
        "co", "coś", "czy", "czyż", "dzięki", "do", "dokąd", "dużo", "gdy", "gdyby",
        "jak", "jaki", "jakie", "jakiego", "jako", "je", "jeśli", "jesteś", "jest",
        "jestem", "każdy", "kiedy", "kto", "która", "które", "którego", "mimo",
        "możesz", "na", "nad", "naj", "nam", "nas", "nawet", "nie", "nic",
        "nikt", "nigdy", "o", "obok", "od", "ona", "one", "oni", "ono", "oraz",
        "otóż", "po", "pod", "pomimo", "przed", "przez", "sama", "sami", "się",
        "siebie", "sobie", "spod", "swoje", "tak", "tam", "ten", "to", "tobie",
        "tutaj", "w", "wa", "wtedy", "więc", "wielu", "wszystko", "wszystkich",
        "z", "za", "ze", "zł", "żeby"
    )
    private val STOP_WORDS = EN_STOP_WORDS + PL_STOP_WORDS
    private val cosineSimilarity = CosineSimilarity()

    /**
     * @return 1 is perfect similarity
     */
    fun similarity(titleA: String, titleB: String): Double {
        val normalizedText1 = normalizeText(titleA, STOP_WORDS)
        val normalizedText2 = normalizeText(titleB, STOP_WORDS)
        return cosineSimilarity.similarity(normalizedText1, normalizedText2)
    }

    private fun normalizeText(text: String, stopWords: Set<String>): List<String> {
        val tokenizer = SimpleTokenizer.INSTANCE
        val porterStemmer = PorterStemmer()

        return tokenizer.tokenize(text).mapNotNull { word ->
            if (word.lowercase() !in stopWords) {
                porterStemmer.stem(word.lowercase())
            } else {
                null
            }
        }.toList()
    }

}