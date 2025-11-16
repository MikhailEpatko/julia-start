package ru.julia.start

import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    if (firstResult == secondResult) {
        println("Вы победили!")
    } else {
        println("Не в этот раз...")
    }
}