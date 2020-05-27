package com.vk.axwer.kotlin.p611

// 6.1.1. Типы с поддержкой значения null
fun main() {
    val x: String? = null
    val y = "abc"

    println(strLen(y))
    println(strLenSafe(x))
    println(strLenSafe(y))
}

fun strLen(s: String) = s.length

// Работа со значениям null с помощью проверки if
fun strLenSafe(s: String?): Int =
        if (s != null) s.length else 0