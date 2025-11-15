package ru.julia.start

fun main() {
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = supported.contains(requested)
    println("Support for $requested: $isSupported")
}