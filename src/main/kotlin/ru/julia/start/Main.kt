package ru.julia.start

import kotlin.time.Duration.Companion.hours

fun main() {
    intervalInSeconds(1, 20, 15)
    intervalInSeconds(minutes = 1, seconds = 25)
    intervalInSeconds(2)
    intervalInSeconds(minutes= 10, 0)
    intervalInSeconds(hours=1,seconds= 1)
}

fun intervalInSeconds(
    hours: Int = 0
    minutes: Int =0
    seconds: Int = 0
)Int=(hours * 60) + minutes) * 60 + seconds){
    println(intervalInSeconds())
}