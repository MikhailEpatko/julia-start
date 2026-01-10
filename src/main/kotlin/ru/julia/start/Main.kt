package ru.julia.start

fun main() {
    println(countWords(" qwe aa aaaa xxxxx y x xxx "))
}

fun countWords(input: String): Int {
    if (input.isEmpty()) {
        return 0
    }
    var counter = 0
    var inWord = false
    for (char in input) {
        when (char) {
            ' ', '\n', '\t' ->
                if (inWord) {
                    counter++
                    inWord = false
                }

            else ->
                if (!inWord) {
                    inWord = true
                }
        }
    }
    if (inWord) {
        counter++
    }
    return counter
}

fun countWords2(input: String): Int =
    input
        .split("\\s+".toRegex()) // 1
        .count { !it.isEmpty() } // 2

// 1 - разделяем строку на список строк по шаблону-разделителя.
//     В данном случае шаблон разделителя опеределяется как регулярное выражение
//     "//s+".toRegex(), которое читается как "любое количество пустых символов
//     (пробел, табуляция, переход на новую строку и др.).
//
// 2 - считаем количество элементов сеписка, удовлетворяющих условию "не пустая строка".