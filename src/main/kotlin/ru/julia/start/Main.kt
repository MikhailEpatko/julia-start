package ru.julia.start

fun main() {
    println("main")
}

fun flipTheNumber(input: Int): Int {
    var number = input
    var lastNumber = 0

    while (number > 0) {
        lastNumber = lastNumber * 10 + number % 10
        number /= 10
    }
    return lastNumber
}