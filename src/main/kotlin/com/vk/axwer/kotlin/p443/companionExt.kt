package com.vk.axwer.kotlin.p443

// Определение функции-расширения для объекта-компаньона
fun main() {
    val citizen = Citizen.from("Kevin;Mitnik")
    println("${citizen.firstName} ${citizen.lastName}")
}

// Модуль реализации бизнес-логики
class Citizen(val firstName: String, val lastName: String) {
    companion object {} // Объявление пустого объекта-компаньона, обязательно
}

// Модуль реализации взаимодействий между клиентом и сервером
fun Citizen.Companion.from(str: String): Citizen {
    return Citizen(str.substringBefore(';'), str.substringAfter(';'))
}