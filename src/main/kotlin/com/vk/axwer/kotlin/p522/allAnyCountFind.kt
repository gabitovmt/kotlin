package com.vk.axwer.kotlin.p522

import com.vk.axwer.kotlin.p521.Person

// 5.2.2. Применение предикатов к коллекциям: функции "all", "any", "count" и "find"
fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val people = listOf(Person("Alice", 27), Person("Bob", 31), Person("Nick", 30))

    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    val list = listOf(1, 2, 3)
    // Символ отрицания ! трудно заметить, поэтому в данном случае лучше использовать "any"
    println(!list.all { it == 3 })
    // Условие в этом аргументе поменялось на противоположное
    println(list.any { it != 3 })

    println(people.count(canBeInClub27))
    println(people.filter(canBeInClub27).size)  // Этот способ медленнее, т.к. создаётся промежуточная коллекция

    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))
}