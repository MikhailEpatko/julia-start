package ru.julia.start

import kotlin.time.Duration.Companion.hours

fun main() {
    intervalInSeconds(1, 20, 15)
    intervalInSeconds(minutes = 1, seconds = 25)
    println(intervalInSeconds(2))
    println(intervalInSeconds(minutes= 10, 0)
    println(intervalInSeconds(houers=1,seconds= 1)
}

fun intervalInSeconds(
    hours: Int = 0
    minutes: Int =0
    seconds: Int = 0
){
    println((hours * 60) + minutes) * 60 + seconds))

}
    (