package ru.julia.start

fun main() {
    println("123->${flipTheNumber(123)}")
    println("322)->${flipTheNumber(322)"}
    println(1)
    println(0)
    println(3412)
    println(701118291)
}

fun flipTheNumber(input: Int): Int {
    var number = readln().toInt()
    var lastNumber = 0

    if (number > 0) {
        lastNumber = (lastNumber * 10) + (number % 10)
        number /= 10
    }
    return if (number < 0) -lastNumber else lastNumber
}