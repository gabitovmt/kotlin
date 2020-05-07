package com.vk.axwer.kotlin.p322

import java.lang.StringBuilder

// 3.2.2. Значения параметров по умолчанию
fun main() {
    val list = listOf(1, 2, 3)
    println(joinToString(list, ", ", "", ""))
    println(joinToString(list))
    println(joinToString(list, postfix = ";", prefix = "# "))
}

// Объявление функции joinToString() со значениями параметров по умолчанию
fun <T> joinToString(
        collection: Collection<T>,
        separator: String = ", ", prefix: String = "", postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

@JvmOverloads   // Создаёт перегруженные версии функции
fun <T> javaJoinToString(
        collection: Collection<T>,
        separator: String = ", ", prefix: String = "", postfix: String = ""
): String = joinToString(collection, separator, prefix, postfix)