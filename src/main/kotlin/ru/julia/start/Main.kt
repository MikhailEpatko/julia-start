package ru.julia.start

fun main() {
    println(countWords(" qwe aa aaaa xxxxx y x xxx "))
}

fun countWords(input: String): Int {
    if (input.isEmpty()) {
        return 0
    }

    var counter = 0
    var inWord = false
    for (char in input) {
        when (char) {
            ' ', '\n', '\t' -> {
                if (inWord) {
                    counter++
                    inWord = false
                }
            } else -> {
                if (!inWord) {
                    inWord = true
                }
            }
        }
    }
    if (inWord) {
        counter++
    }
    return counter
}