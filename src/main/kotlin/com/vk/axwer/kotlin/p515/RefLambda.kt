package com.vk.axwer.kotlin.p515

import com.vk.axwer.kotlin.p512.Person

// 5.1.5. Ссылки на члены класса
fun main() {
    val people = listOf(Person("Axwer", 30), Person("Lin", 68))
    val getAge = Person::age
    println(people.maxBy(getAge))
    println(people.maxBy(Person::age))

    run(::salute)   // Ссылка на функцию верхнего уровня

    val nextAction = ::sendEmail    // Делегируем работу функции sendEmail
    nextAction(people[0], "Hello student!")

    // Ссылка на конструктор
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    // Ссылка на функцию-расширение
    val predicate = Person::isAdult
    println(predicate(p))

    // Ссылка на метод конкретного экземпляра класса
    val alicesIsAdultFunction = p::isAdult
    println(alicesIsAdultFunction())
}

fun salute() = println("Salute!")

fun sendEmail(person: Person, message: String) {
    println("${person.name} has received message: $message")
}

fun Person.isAdult() = age >= 21