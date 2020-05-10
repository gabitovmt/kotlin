package com.vk.axwer.kotlin.p251

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

// 2.5.1. "try", "catch" и "finally"
fun main() {
    printPercentage(50)

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    // В Kotlin нет try-with-resources
}

fun printPercentage(number: Int) {
    val percentage =
            if (number in 0..100)
                number
            else
                // "throw" - это выражение
                throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")
    println("$percentage%")
}

// Использование try как в Java
fun readNumber(reader: BufferedReader): Int? {  // Не требуется явно указывать, какое исключение может возбудить функция
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {    // Тип исключения записывается справа
        return null
    } finally {     // Блок "finally" действует так же, как в Java
        reader.close()
    }
}