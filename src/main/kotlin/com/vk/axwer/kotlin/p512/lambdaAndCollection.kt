package com.vk.axwer.kotlin.p512

// 5.1.2. Лямбда-выражения и коллекции
fun main() {
    // Поиск в коллекции с помощью лямбда-выражения
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })

    // Поиск с использованием ссылки на член
    people.maxBy(Person::age)
}

data class Person(val name: String, val age: Int)