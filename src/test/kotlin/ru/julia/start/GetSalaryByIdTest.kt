package ru.julia.start

import org.junit.jupiter.api.DisplayName
import kotlin.test.Test
import kotlin.test.assertEquals

class GetSalaryByIdTest {

    @Test
    @DisplayName("Табличный тест")
    fun getSalaryById1() {
        mapOf(
            1 to 20,
            2 to 0,
            3 to 21,
            4 to 23,
            5 to 0,
            100 to 0,
        )
            .forEach { (id, salary) ->
                assertEquals(salary, getSalaryById(id))
            }
    }
}