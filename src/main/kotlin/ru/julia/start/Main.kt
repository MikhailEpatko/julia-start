package ru.julia.start

fun main() {
}

fun flipTheNumber(input: Int): Int {
    var number = readln().toInt()
    var lastNumber = 0

    if (number > 0) {
        lastNumber = (lastNumber * 10) + (number % 10)
        number /= 10
    } else {
    }
}