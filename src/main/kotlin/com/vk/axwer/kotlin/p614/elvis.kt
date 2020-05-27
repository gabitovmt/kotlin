package com.vk.axwer.kotlin.p614

import com.vk.axwer.kotlin.p613.Address
import com.vk.axwer.kotlin.p613.Company
import com.vk.axwer.kotlin.p613.Person

// 6.1.4. Оператор "Элвис": "?:"
fun main() {
    println(strLenSafe("abc"))
    println(strLenSafe(null))

    val person = Person("Dmitry", null)
    println(person.countryName())

    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person2 = Person("Dmitry", jetbrains)
    printShippingLabel(person2)

    printShippingLabel(Person("Alexey", null))
}

// Применение оператора "Элвис" для работы с null
fun strLenSafe(s: String?): Int =
        s?.length ?: 0
fun Person.countryName() =
        company?.address?.country ?: "Unknown"

// Использование оператора throw с оператором "Элвис"
fun printShippingLabel(person: Person) {
    val address = person.company?.address
            ?: throw IllegalArgumentException("No address") // Вызовет исключение в отсутствие адреса
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}