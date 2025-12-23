package ru.julia.start

fun main() {
    println(separateNumbers(mutableListOf(0, 4, -3, 3, 1, -6, -5, 0, -2)))
}

fun separateNumbers(numbers: List<Int>): List<Int> {
    val listone = mutableListOf<Int>()
    for (number in numbers) {
        if (number < 0) {
            -number
        }
    }
    return listone
}