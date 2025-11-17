package ru.julia.start

fun main() {
    val button = "A"
    when {
        button == "A" -> println("Yes")
        button == "B" -> println("No")
        button == "X" -> println("Menu")
        button == "Y" -> println("Nothing")
        else -> print("Error: There is no such button")
    }
}