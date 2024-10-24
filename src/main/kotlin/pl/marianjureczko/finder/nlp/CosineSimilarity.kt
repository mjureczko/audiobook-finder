package pl.marianjureczko.finder.nlp

import org.apache.commons.math3.linear.ArrayRealVector
import org.apache.commons.math3.linear.RealVector

class CosineSimilarity {
    fun similarity(sentence1 :List<String>, sentence2 : List<String>): Double {
        val frequencyMap1 = sentence1.groupingBy { it }.eachCount()
        val frequencyMap2 = sentence2.groupingBy { it }.eachCount()
        val allWords = (frequencyMap1.keys + frequencyMap2.keys).distinct()

        // Create vectors based on term frequencies for each sentence
        val vector1 = allWords.map { word -> frequencyMap1.getOrDefault(word, 0).toDouble() }.toDoubleArray()
        val vector2 = allWords.map { word -> frequencyMap2.getOrDefault(word, 0).toDouble() }.toDoubleArray()

        val v1: RealVector = ArrayRealVector(vector1)
        val v2: RealVector = ArrayRealVector(vector2)

        // Calculate cosine similarity
        val dotProduct = v1.dotProduct(v2)
        val norm1 = v1.norm
        val norm2 = v2.norm

        return dotProduct / (norm1 * norm2)
    }
}