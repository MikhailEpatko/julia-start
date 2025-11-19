package ru.julia.start

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GenerateRandomEmployeeTest {

    private val names = listOf("John", "Jane", "Marry", "Peeter")
    private val minSalary = 10
    private val maxSalary = 50

    @Test
    @DisplayName("Проверяем, что name и salary соответствуют допустимым значениям")
    fun generateRandomEmployee1() {
        val employee = generateRandomEmployee(
            names = names,
            minSalary = minSalary,
            maxSalary = maxSalary,
        )

        assertTrue(employee.name in names)
        assertTrue(employee.salary >= minSalary)
        assertTrue(employee.salary <= maxSalary)
    }

    @Test
    @DisplayName("Проверяем, что name и salary выбираются случайно")
    fun generateRandomEmployee2() {
        val employee1 = generateRandomEmployee(
            names = names,
            minSalary = minSalary,
            maxSalary = maxSalary,
        )
        val employee2 = generateRandomEmployee(
            names = names,
            minSalary = minSalary,
            maxSalary = maxSalary,
        )
        val employee3 = generateRandomEmployee(
            names = names,
            minSalary = minSalary,
            maxSalary = maxSalary,
        )
        val employee4 = generateRandomEmployee(
            names = names,
            minSalary = minSalary,
            maxSalary = maxSalary,
        )

        assertFalse(
            employee1.name == employee2.name &&
                employee2.name == employee3.name &&
                employee3.name == employee4.name
        )
        assertFalse(
            employee1.salary == employee2.salary &&
                employee2.salary == employee3.salary &&
                employee3.salary == employee4.salary
        )
    }
}