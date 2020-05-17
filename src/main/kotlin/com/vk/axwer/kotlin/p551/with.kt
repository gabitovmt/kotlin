package com.vk.axwer.kotlin.p551

// 5.5.1. Функция "with"
fun main() {
    println(alphabet1())
    println(alphabet2())
    println(alphabet3())
}

// Генерация алфавита
fun alphabet1(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

// Использование функции with для генерации алфавита
fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {    // Определяется получатель, методы которого будут вызываться
        for (letter in 'A'..'Z') {
            this.append(letter)     // Вызов метода получателя с помощью ссылки "this"
        }
        append("\nNow I know the alphabet!")    // Вызов метода без ссылки "this"
        this.toString() // Возврат значения из лямбда-выражения
    }
}

// Применение функции with и тела-выражения для генерации алфавита
fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}