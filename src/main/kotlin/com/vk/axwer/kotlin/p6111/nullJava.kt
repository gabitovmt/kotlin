package com.vk.axwer.kotlin.p6111

// 6.1.11. Допустимость значения null и Java
fun main() {
//    val person = Person("Axwer", null, null)  Не скомпилируется
    val person = Person("Axwer", "Axwer", "Mitnik")

    try {
        yellAt(Person(null))
    } catch (e: Exception) {
        e.printStackTrace()
    }
    yellAtSafe(Person(null))
}

// Обращение к Java-классу без дополнительных проверок на null
fun yellAt(person: Person) {
    println(person.name.toUpperCase() + "!!!")
}

// Обращение к классу Java с проверками на null
fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toUpperCase() + "!!!")
}