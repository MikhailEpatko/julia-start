package ru.julia.start

fun main() {
    val n = 5

    for (i in 1..n) {
        for (y in 1..n - i) {
            print(" ")
        }
        for (r in 1..i) {
            print("* ")
        }
        println()
    }
    for (l in 4 downTo 1) {
        for (t in n - l downTo 1) {
            print(" ")
        }
        for (s in l downTo 1) {
            print("* ")
        }
        println()
    }
}