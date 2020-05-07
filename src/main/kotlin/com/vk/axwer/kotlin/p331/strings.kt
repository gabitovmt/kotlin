package com.vk.axwer.kotlin.p331

// 3.3.1. Директива импорта и функции-расширения

// Импорт функции расширения
import com.vk.axwer.kotlin.p330.lastChar
// Можно импортировать весь пакет
//import com.vk.axwer.kotlin.p330.*
// Можно изменить имя импортируемого класса или функции
import com.vk.axwer.kotlin.p330.lastChar as last

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".last())
}