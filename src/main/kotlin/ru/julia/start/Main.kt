package ru.julia.start

fun main() {
    println(listone)
}

fun separateNumbers(numbers: List<Int>): List<Int> {
    val listone = mutableListOf<Int>()
    val listtwo = mutableListOf<Int>()
    for (number in numbers) {
        if (number % 2 == 0) {
            listone.add(number)
        } else {
            listtwo.add(number)
        }
    }
    return listone + listtwo
}