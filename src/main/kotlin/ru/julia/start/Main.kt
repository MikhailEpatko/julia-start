package ru.julia.start

fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    val greenNumbers2 = greenNumbers.size
    val redNumbers2 = redNumbers.size
    val greenNumbers3 = greenNumbers2.plus(redNumbers2)

    println(greenNumbers3)
}
