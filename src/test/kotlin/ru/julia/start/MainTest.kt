package ru.julia.start

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    @DisplayName("Проверяем разделение чисел")
    fun separateNumbersTest() {
        mapOf(
            listOf(0, 4, 3, 3, 1, 6, 5, 0, 2) to listOf(4, 6, 2, 0, 3, 3, 1, 5, 0),
            listOf(0) to listOf(0),
            listOf(3, 1) to listOf(3, 1),
            listOf(1, 2) to listOf(2, 1),
            emptyList<Int>() to emptyList<Int>(),
        ).forEach { (numbers, expected) ->
            assertEquals(expected, separateNumbers(numbers))
        }
    }
}