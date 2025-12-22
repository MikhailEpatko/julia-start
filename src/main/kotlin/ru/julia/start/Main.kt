package ru.julia.start

fun main() {
    println(separateNumbers(listOf(0, 4, 3, 3, 1, 6, 5, 0, 2)))
    println(separateNumbers(listOf(0)))
    println(separateNumbers(listOf(3, 1)))
    println(separateNumbers(listOf(1, 2)))
}

fun separateNumbers(numbers: List<Int>): List<Int> {
    val listone = mutableListOf<Int>()
    val listtwo = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0 && number != 0) {
            listone.add(number)
        } else {
            listtwo.add(number)
        }
    }
    return listone + listtwo
}