package com.vk.axwer.kotlin.p431

// 4.3.1. Универсальные методы объектов
fun main() {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1)

    println(client1 == client2)     // Аналог equals() в Java
    println(client1 === client2)    // Аналог == в Java

    val processed = hashSetOf(client1)
    println(processed.contains(client2))
}

class Client(val name: String, val postalCode: Int) {
    // "Any" - это аналог java.lang.Object: суперкласс всех классов в Kotlin. Знак вопроса в "Any?" означает,
    // что аргумент "other" может иметь значение null
    override fun equals(other: Any?): Boolean =
            other != null && other is Client && name == other.name && postalCode == other.postalCode

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode

    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}