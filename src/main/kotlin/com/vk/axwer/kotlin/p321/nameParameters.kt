package com.vk.axwer.kotlin.p321

import java.lang.StringBuilder

// 3.2. Упрощение вызова функций
fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))

    // 3.2.1. Именованные аргументы
    println(joinToString(list, separator = " ", prefix = " ", postfix = "."))
}

// Начальная реализация joinToString()
fun <T> joinToString(
        collection: Collection<T>,
        separator: String, prefix: String, postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}