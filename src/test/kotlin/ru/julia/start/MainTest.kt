package ru.julia.start

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import kotlin.test.Test

class MainTest {

    @Test
    @DisplayName("Проверяем подсчёт чётных чисел")
    fun evenNumberCountTest() {
        mapOf(
            listOf(0, 1, 2, 3, 4) to 2,
            listOf(0) to 0,
            listOf(1, 3) to 0,
        ).forEach { (numbers, expected) ->
            assertEquals(expected, evenNumberCount(numbers))
        }
    }
}