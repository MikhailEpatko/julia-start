package ru.julia.start

fun main() {
    evenNumberCount(listOf<Int>(0, 1, 2, 3, 4))
    evenNumberCount(listOf<Int>(0))
    evenNumberCount(listOf<Int>(1, 3))
}

fun evenNumberCount(numbers: List<Int>): Int {
    for (a in numbers) {
        if (a % 2 == 0) {
            val b: Int = a.sum()
            println(b)
        }
    }
    return 0
}