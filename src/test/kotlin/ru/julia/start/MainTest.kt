package ru.julia.start

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    @DisplayName("Табличный тест")
    fun circleAreaTest() {
        mapOf(
            1.0 to 3.141592,
            2.0 to 12.566370,
            3.0 to 28.274333,
            10.0 to 314.159265,
        )
            .forEach { radius, expectedArea ->
                assertEquals(
                    expected = expectedArea,
                    actual = circleArea(radius),
                    absoluteTolerance = 0.000001, // здесь говорим, что два Double числа должны совпадать до 6 знака
                )
            }
    }
}