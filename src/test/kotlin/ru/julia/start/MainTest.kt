package ru.julia.start

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    @DisplayName("Проверяем преобразование чисел")
    fun makePositiveTest() {
        mapOf(
            listOf(0, 4, -3, 3, 1, -6, -5, 0, -2) to listOf(0, 4, 3, 3, 1, 6, 5, 0, 2),
            listOf(0) to listOf(0),
            listOf(-3, 1) to listOf(3, 1),
            listOf(1, -2) to listOf(1, 2),
            emptyList<Int>() to emptyList<Int>(),
        ).forEach { (numbers, expected) ->
            assertEquals(expected, makePositive(numbers))
        }
    }
}
