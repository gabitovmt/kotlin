package com.vk.axwer.kotlin.p530

import com.vk.axwer.kotlin.p521.Person

// 5.3. Отложенные операции над коллекциями: последовательности
fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Nick", 30))
    println(
            people.asSequence()         // Преобразует исходную коллекцию в последовательность
                    .map(Person::name)  // Последовательность реализует тот же API, что и коллекции
                    .filter { it.startsWith("A") }
                    .toList()           // Преобразует получившейся последовательности обратно в список
    )
}