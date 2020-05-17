package com.vk.axwer.kotlin.p552

// 5.5.2. Функция "apply"
fun main() {
    println(alphabet1())
    println(alphabet2())
}

// Использование функции apply для генерации алфавита
fun alphabet1() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

// Использование функции buildString для генерации алфавита
fun alphabet2() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}