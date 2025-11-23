package ru.julia.start

fun main() {
     val height=5
    for (i in height downTo 1) {
        if(i<5)
            print("")

        for (y in 1..i) {
            print("*")
                    }
        println()
    }
}