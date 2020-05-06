package com.vk.axwer.kotlin.p212

// 2.1.2. Функции
fun main() {
    println(max(1, 2))
    println(min(1, 2))
    println(equals(1, 2))
}

// Функция. Здесь функция имеет тело-блок
fun max(a: Int, b: Int): Int {
    // Тернарный оператор
    return if (a > b) a else b
}

// Здесь функция имеет тело-выражение
fun min(a: Int, b: Int): Int = if (a < b) a else b

// Здесь используется выведение типа возвращаемого значения функции
fun equals(a: Int, b: Int) = a == b