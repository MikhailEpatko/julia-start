package ru.julia.start

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun createUrlTest() {
        val prefix = "https://example.com/book-info"
        val id = 5
        val actions = listOf("title", "year", "author")
        val expectedUrls = listOf(
            "https://example.com/book-info/5/title",
            "https://example.com/book-info/5/year",
            "https://example.com/book-info/5/author",
        )

        val result = createUrl(
            prefix = prefix,
            id = id,
            actions = actions,
        )

        assertEquals(expectedUrls, result)
    }
}