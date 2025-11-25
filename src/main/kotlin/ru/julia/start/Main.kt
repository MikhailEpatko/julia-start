package ru.julia.start

fun main() {
         for (i in 1..5) {
        for (y in 1..5-i) {
            print(" ")
        }
        for (k in 1..2*i-1){
            print("*")
        }
        println()
    }
}