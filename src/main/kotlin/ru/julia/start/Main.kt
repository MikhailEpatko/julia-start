package ru.julia.start

fun main() {
    val number2word = mapOf<Int, String>(
        1 to "один",
        2 to "два",
        3 to "три",
        4 to "четыре",
        5 to "пять",
    )
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}