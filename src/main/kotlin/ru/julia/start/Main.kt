package ru.julia.start

fun main() {
    val alphabets=("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z")
    val button = alphabets
    if (button == "A") {
        println("Yes")
    } else if (button == "B") {
        println("No")
    } else if (button == "X") {
        println("Menu")
    } else if (button == "Y") {
        println("Nothing")
    } else {
        println("Error: There is no such button")
    }
//button - это кнопка, которую пользователь нажал на контроллере (джойстике, клавиатуре).
//По нажатию на кнопку, код должен выводить в консоль соответствующий ей ответ или ошибку, если драйвер про такую кнопку ничего не знает.
//
//Кнопка - Ответ
//A - "Yes"
//B - "No"
//X - "Menu"
//Y - "Nothing"
//Любая другая - "Error: There is no such button"