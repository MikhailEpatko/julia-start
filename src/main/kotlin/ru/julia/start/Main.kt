package ru.julia.start

fun main() {
    var pizzaSlices = 0
    pizzaSlices++
    while (pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}