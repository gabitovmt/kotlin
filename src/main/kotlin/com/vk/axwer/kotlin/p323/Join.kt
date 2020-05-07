@file:JvmName("StringFunctions")    // Аннотация для объявления имени класса
package com.vk.axwer.kotlin.p323

import java.lang.StringBuilder

// 3.2.3. Избавление от статических вспомогательных классов: свойства и функции верхнего уровня

// Объявление joinToString() как функции верхнего уровня
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

var opCount = 0 // Объявление свойства верхнего уровня
fun performOperation() {
    opCount++   // Изменение значения свойства
}
fun reportOperationCount() {
    println("Operation performed $opCount times")   // Чтение значения свойства
}

// Доступен через getter-метод в Java
val UNIX_LINE_SEPARATOR = "\n"
// Объявляется как public final static String ...
const val WINDOWS_LINE_SEPARATOR = "\r\n"