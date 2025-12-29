package ru.julia.start

fun main() {
    println("main")
}

fun makePositive(numbers: List<Int>): List<Int> = numbers.map { if (it < 0) -it else it }
