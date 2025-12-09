package ru.julia.start

import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle

fun main() {
    println(prefix = "https://example.com/book-info", id = 5, actions = listOf("title", "year", "author"))
}

fun createUrl(
    prefix: String = "https://example.com/book-info",
    id: Int = 5,
    actions: List<String> = listOf("title", "year", "author"),
): String {
    val res = "$prefix/$id/$actions"
    return (res)
}