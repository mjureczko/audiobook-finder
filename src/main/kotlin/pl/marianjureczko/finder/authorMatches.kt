package pl.marianjureczko.finder

fun authorMatches(authors: List<String>?, queryAuthor: String): Boolean {
    if (queryAuthor.isEmpty()) return true
    if (authors.isNullOrEmpty()) return true
    return authors.any { author ->
        author.contains(queryAuthor, ignoreCase = true)
    }
}