package com.vk.axwer.kotlin.p6301

import java.io.BufferedReader
import java.io.StringReader

// 6.3.1. коллекции и допустимость значения null
fun main() {
    val reader = BufferedReader(StringReader(fileBody))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
    addValidNumbersV2(numbers)
}

val fileBody = """
    4
    
    8
    15
    
    
    16
    23
    
    42
""".trimIndent()

// Создание коллекции, которая может хранить значения null
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()  // Создание списка значений типа Int с поддержкой null
    for (line in reader.lineSequence()) {
        // Добавление в список целочисленного значения или null, если строка не может быть преобразована в число
        result.add(line.toIntOrNull())
    }
    return result
}

// Работа с коллекцией, которая может хранить значения null
fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {   // Чтение из списка значения, которое может оказаться рвным null
        if (number != null) {   // Проверка значения на null
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

// Применение функции filterNotNull к коллекции, которая может хранить значения null
fun addValidNumbersV2(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}