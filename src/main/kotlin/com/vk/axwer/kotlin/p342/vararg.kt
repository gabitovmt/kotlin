package com.vk.axwer.kotlin.p342

// 3.4.2. Функции, принимающие произвольное число аргументов
fun main() {
    val array: Array<Int> = arrayOf(1, 2, 3)
    val list = listOf(0, *array)    // Оператор "звёздочка" распаковывает содержимое массива
    println(list)
}