package com.vk.axwer.kotlin.p532

// 5.3.2. Создание последовательностей
fun main() {
    // Создание и использование последовательности натуральных чисел
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) // Все отложенные операции выполнятся при обращении к "sum"
}