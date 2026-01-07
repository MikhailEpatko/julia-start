package ru.julia.start

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.function.Executable
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    @DisplayName("Тест переворачивания числа")
    fun flipTheNumberTest() {
        val testData = mapOf(
            123 to 321,
            322 to 223,
            1 to 1,
            0 to 0,
            3412 to 2143,
            701118291 to 192811107,
        )
        assertAll(
            testData.map { (input, expected) ->
                Executable { assertEquals(expected, flipTheNumber(input), "число: $input") }
            }
        )
    }
}