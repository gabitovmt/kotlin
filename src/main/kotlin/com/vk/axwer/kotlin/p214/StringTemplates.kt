package com.vk.axwer.kotlin.p214

// 2.1.4. Простое форматирование строк: шаблоны
fun main(args: Array<String>) {
    hello1(args)
    hello2(args)
    hello3(args)

    // Чтобы использовать символ $ в строке, его нужно экранировать
    println("\$10")
}

fun hello1(args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    // Применение строковых шаблонов
    println("Hello, $name!")
}

fun hello2(args: Array<String>) {
    if (args.isNotEmpty()) {
        // Синтаксис ${} используется для подстановки первого элемента массива args
        println("Hello, ${args[0]}!")
    }
}

fun hello3(args: Array<String>) {
    // Использование двойных кавычек внутри других двойных кавычек
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}")
}