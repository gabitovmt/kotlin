package com.vk.axwer.kotlin.p6202

// 6.2.2. Примитивные типы с поддержкой null: Int?, Boolean? и прочие
fun main() {
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}

// Работа с простыми типами, допускающими значение null
data class Person(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}