package com.vk.axwer.kotlin.p511

import com.vk.axwer.kotlin.p512.Person

// 5.1.1. Введение в лямбда выражения: фрагменты кода как параметры функций
fun main() {
    val people = listOf(
            Person("Vladimir", 30),
            Person("Rinat", 27),
            Person("Marat", 14),
            Person("Dmitri", 28)
    )
    // Использование лямбда-выражения
    people.sortedBy { it.age }
    println(people)
}
