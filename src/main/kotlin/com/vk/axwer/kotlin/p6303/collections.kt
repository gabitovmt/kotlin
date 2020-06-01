package com.vk.axwer.kotlin.p6303

// 6.3.3. Коллекции Kotlin и язык Java
fun main() {
    val list = listOf("a", "b", "c")
    printInUpperCase(list)
}

fun printInUpperCase(list: List<String>) {  // Объявление параметра как доступного только для чтения
    println(CollectionUtils.upperCaseAll(list)) // Вызов Java-функции, которая изменяет коллекцию
    println(list.first())   // Показывает, что коллекция изменилась
}