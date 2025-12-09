package ru.julia.start

fun createUrl(
    prefix: String="https://example.com/book-info",
    id:Int =5,
    actions: List<String> = listOf("title", "year", "author"),
): {
    val res = "$prefix/$id/$actions"
    println(res)

}


