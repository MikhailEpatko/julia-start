package ru.julia.start

fun main() {
    println(separateNumbers(listone))
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