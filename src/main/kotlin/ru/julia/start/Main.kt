package ru.julia.start

fun main() {
    println(listOf<Int>(0, 1, 2, 3, 4))
    println(listOf<Int>(0))
    println(listOf<Int>(1, 3))
}

fun evenNumberCount(numbers: List<Int>): Int {
    for (a in 0..4) {
        if (a % 2 == 0) {
            println(a)
        }
    }
    return 0
}