package com.vk.axwer.kotlin.p521

// 5.2.1. Основы: filter и map
fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Nick", 30))

    println(people.filter { it.age >= 30 })
    println(people.map { it.name })
    println(people.filter { it.age > 30 }.map(Person::name))

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
}

data class Person(val name: String, val age: Int)