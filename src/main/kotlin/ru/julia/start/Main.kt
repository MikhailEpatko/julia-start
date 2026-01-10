package ru.julia.start

fun main() {
    println("main")
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
                }
                inWord = false
            }
        } else ->{
            if(!inWord){
                inWord = true
            }
        }
    }
}
