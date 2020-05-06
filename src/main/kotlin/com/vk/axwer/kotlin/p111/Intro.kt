package com.vk.axwer.kotlin.p111

// Класс данных
data class Person(
        val name: String,
        val age: Int? = null    // Тип, допускающий значение null (Int?); значение параметра по умолчанию
)

// Функция верхнего уровня
fun main(args: Array<String>) {
    val persons = listOf(
            Person("Alice"),
            Person("Bob", age = 29)       // Именованный аргумент
    )
    val oldest = persons.maxBy { it.age ?: 0 }  // Лямбда-выражение; оператор "Элвис"
    println("The oldest is: $oldest")           // Строка-шаблон
}