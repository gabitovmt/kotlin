package com.vk.axwer.kotlin.p252

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

// 2.5.2. "try" как выражение
fun main() {
    val reader1 = BufferedReader(StringReader("not a number"))
    readNumber1(reader1) // Ничего не выведет

    val reader2 = BufferedReader(StringReader("not a number"))
    readNumber2(reader2) // Возбудит исключение, поэтому функция выведет "null"
}

// Использование try в качестве выражения
fun readNumber1(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println("num1: $number")
}

// Возврат значения из блока catch
fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }
    println("num2: $number")
}