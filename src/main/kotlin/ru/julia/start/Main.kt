package ru.julia.start

fun main() {
    var pizzaSlices = 0
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    while (pizzaSlices < 8)
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}