package ru.julia.start

fun main() {
    println(evenNumberCount(listOf<Int>(0, 1, 2, 3, 4)))
    println(evenNumberCount(listOf<Int>(0)))
    println(evenNumberCount(listOf<Int>(0, 3)))
}

fun evenNumberCount(numbers: List<Int>): Int {
    var a = 0
    for (b in numbers) {
        if (b % 2 == 0 && b != 0) {
            a++
        }
    }
    return a
}