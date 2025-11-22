package ru.julia.start

fun main() {
    val stars = 5
    for (i in 1..stars) {
        for (y in 1..i) {
            print("* ")
            if (y >= i) break
        }
        println()
    }
}