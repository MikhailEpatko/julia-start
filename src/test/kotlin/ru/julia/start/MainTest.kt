package ru.julia.start

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.function.Executable
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    @DisplayName("Тест подсчёта слов в строке")
    fun countWordsTest() {
        val testData = mapOf(
            " qwe aa aaaa xxxxx y x xxx " to 7,
            "" to 0,
            "a" to 1,
            "           " to 0,
            "\n" to 0,
            "\t" to 0,
            "\t\n" to 0,
            " \n" to 0,
            " \t" to 0,
            " \t\n" to 0,
            "\n " to 0,
            "\t " to 0,
            "\t \n " to 0,
            " \n " to 0,
            " \t " to 0,
            " \t\n " to 0,
            " a b c" to 3,
            " aa\nbbbb\tc  " to 3,
        )
        assertAll(
            testData.map { (input, expected) ->
                Executable { assertEquals(expected, countWords(input), "строка: '$input'") }
            }
        )
    }
}