package com.vk.axwer.kotlin.p432

// 4.3.2. Классы данных: автоматическая генерация универсальных методов
fun main() {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1)

    println(client1 == client2)     // Аналог equals() в Java
    println(client1 === client2)    // Аналог == в Java

    val processed = hashSetOf(client1)
    println(processed.contains(client2))

    // Метод copy()
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}

data class Client(val name: String, val postalCode: Int)