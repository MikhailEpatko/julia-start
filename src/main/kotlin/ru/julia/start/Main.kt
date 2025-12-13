package ru.julia.start

fun main() {
    repeatN(5) {
        println("Привет")
    }
}

fun repeatN(
    n: Int,
    action: () -> Unit,
) {
    for (action in 1..n) {
        action()
    }
}