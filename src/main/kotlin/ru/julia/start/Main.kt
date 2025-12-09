package ru.julia.start

fun main() {
    println(createUrl(actions = listOf("title")))
    println(createUrl(actions = listOf("year")))
    println(createUrl(actions = listOf("author")))
}

fun createUrl(
    prefix: String = "https://example.com/book-info",
    id: Int = 5,
    actions: List<String> = listOf("title", "year", "author"),
): List<String> {
    val res = "$prefix/$id/$actions"
    return res
}