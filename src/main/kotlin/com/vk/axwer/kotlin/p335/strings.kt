package com.vk.axwer.kotlin.p335

import java.lang.StringBuilder

// 3.3.5. Свойства-расширения
fun main() {
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}

// Объявление свойства-расширения
val String.lastChar: Char
    get() = get(length - 1)

// Объявление изменяемого свойства-расширения
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) = this.setCharAt(length - 1, value)