package ru.julia.start

fun main() {
    val numb = 1..100
    for (number in numb) {
        when {
            number % (3 * 5) == 0 -> println("fizzbuzz")
            number % 3 == 0 -> println("fizz")
            number % 5 == 0 -> println("buzz")
        }
    }
}