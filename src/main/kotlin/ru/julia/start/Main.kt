package ru.julia.start

fun main() {
//    val words = listOf("dinosaur", "limousine", "magazine", "language")
//    val letter = words.filter { words -> words.contains("l") }
//    println(letter)
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    val res = words.filterIndexed { index, value -> index != 0 && value.startsWith('l') }
//        (words[0].startsWith("l"))
    println(res)
}