package com.vk.axwer.kotlin.p213

import kotlin.random.Random

// 2.1.3. Переменные
fun main() {
    // Переменные без указания типов. Kotlin выводит типы сам
    val question = "The Ultimate Question of Life, the Universe, and Everything"
    val answer = 42
    println(question)
    println(answer)

    // Переменная с указанием типа
    val anotherAnswer: Int = 42
    println(anotherAnswer)

    // Переменная с типом Double
    val yearsToCompute = 7.5e6
    println(yearsToCompute)

    // Если инициализирующего выражения нет, то тип нужно указывать явно
    val otherAnswer: Int
    otherAnswer = 24
    println(otherAnswer)

    // val можно инициализировать разными значениями
    val message: String
    if (Random.nextBoolean()) {
        message = "Success"
    } else {
        message = "Failed"
    }
    println(message)

    // val нельзя менять
    val itIsFinal = 1
    // itIsFinal = 2    Ошибка компиляции
    println(itIsFinal)

    // var можно менять
    var itIsVariable = 1
    itIsVariable = 2
    println(itIsVariable)

    // Хоть и val, коллекцию менять можно
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println(languages)

    // Значение var хоть и можно менять, но тип менять нельзя
    var num = 42
    // num = "42"   Ошибка компиляции
    println(num)
}