package ru.julia.start

fun main() {
    println(flipTheNumber(123))
    println(flipTheNumber(322))
    println(flipTheNumber(1))
    println(flipTheNumber(0))
    println(flipTheNumber(3412))
    println(flipTheNumber(701118291))
}

fun flipTheNumber(input: Int): Int {
    var number = input
    var lastNumber = 0

    while (number > 0) {
        lastNumber = (lastNumber * 10) + (number % 10)
        number /= 10
    }
    return lastNumber
}