package com.vk.axwer.kotlin.p333

import java.lang.StringBuilder

// 3.3.3. Вспомогательные функции как расширения
fun main() {
    println(listOf(1, 2, 8).joinToString(" "))
    println(listOf("one", "two", "eight").join(" "))
}

// Функция joinToString() как расширение
fun <T> Collection<T>.joinToString(
        separator: String = ", ", prefix: String = "", postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// Функция расширение для конкретного типа Collection
fun Collection<String>.join(
        separator: String = ", ", prefix: String = "", postfix: String = ""
) = joinToString(separator, prefix, postfix)