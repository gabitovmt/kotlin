package com.vk.axwer.kotlin.p6203

// 6.2.3. Числовые преобразования
fun main() {
    val i = 1
//    val l: Long = i   Не скомпилируется
    val l: Long = i.toLong()

    val x = 1
    val list = listOf(1L, 2L, 3L)
    println(x.toLong() in list)

    val b: Byte = 1     // Значение константы получит корректный тип
    val long = b + 1L   // Оператор + работает с аргументами типа Byte и Long
    foo(42)          // Компилятор интерпретирует 42 как значение типа Long

    // Преобразование строк
    println("42".toInt())
}

fun foo(l: Long) = println(l)