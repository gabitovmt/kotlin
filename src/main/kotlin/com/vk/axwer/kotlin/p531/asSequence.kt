package com.vk.axwer.kotlin.p531

import com.vk.axwer.kotlin.p521.Person

// 5.3.1. Выполнение операций над последовательностями: промежуточная и завершающая операции
fun main() {
    println("TEST 1")
    listOf(1,2,3,4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    // Ничего не выведет

    println("TEST 2")
    listOf(1,2,3,4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList()
    println()
    // map(1) filter(1) map(2) filter(4) map(3) filter(9) map(4) filter(16)

    println("TEST 3")
    println(
            listOf(1,2,3,4).asSequence()
                    .map { print("map($it) "); it * it }
                    .find { it > 3 }
    )
    // map(1) map(2) 4

    println("TEST 4")
    val people = listOf(
            Person("Alice", 29),
            Person("Bob", 31),
            Person("Charles", 31),
            Person("Dan", 21)
    )
    println(
            people.asSequence()
                    .map { println("map($it) "); it.name }
                    .filter { println("filter($it) "); it.length < 4 }
                    .toList()
    )
    /*
        map(Person(name=Alice, age=29))
        filter(Alice)
        map(Person(name=Bob, age=31))
        filter(Bob)
        map(Person(name=Charles, age=31))
        filter(Charles)
        map(Person(name=Dan, age=21))
        filter(Dan)
        [Bob, Dan]
     */

    println("TEST 5")
    println(
            people.asSequence()
                    .filter { println("filter($it) "); it.name.length < 4 }
                    .map { println("map($it) "); it.name }
                    .toList()
    )
    /*
        filter(Person(name=Alice, age=29))
        filter(Person(name=Bob, age=31))
        map(Person(name=Bob, age=31))
        filter(Person(name=Charles, age=31))
        filter(Person(name=Dan, age=21))
        map(Person(name=Dan, age=21))
        [Bob, Dan]
     */
}