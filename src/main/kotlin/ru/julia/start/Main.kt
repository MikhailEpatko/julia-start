package ru.julia.start

import jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle

fun main() {
    createUrl("https://example.com/book-info", 5, "title")
}

fun createUrl(
    prefix: String = "https://example.com/book-info",
    id: Int = 5,
    actions: List<String> = listOf("title", "year", "author"),
) {
    val res = "$prefix/$id/$actions"
    println(res)
}