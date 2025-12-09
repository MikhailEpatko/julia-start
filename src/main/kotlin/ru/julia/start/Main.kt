package ru.julia.start

fun main() {
    println(createUrl(actions = "title"))
    println(createUrl(actions = "year"))
    println(createUrl(actions = "author"))
}

fun createUrl(
    prefix: String = "https://example.com/book-info",
    id: Int = 5,
    actions: String = "",
): String {
    val res = "$prefix/$id/$actions"
    return res
}