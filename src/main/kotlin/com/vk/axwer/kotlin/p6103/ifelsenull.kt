package com.vk.axwer.kotlin.p6103

// 6.1.3. Оператор безопасного вызова: "?."
fun main() {
    printAllCaps("abc")
    printAllCaps(null)

    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    val person = Person("Dmitry", null)
    println(person.countryName())
}

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

// Применение оператора безопасного вызова для доступа к свойствам, способным принимать значение null
class Employee(val name: String, val manager: Employee?)
fun managerName(employee: Employee): String? = employee.manager?.name

// Объединение нескольких операторов безопасного вызова
class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)
fun Person.countryName(): String {
    val country = this.company?.address?.country    // Объединение нескольких операторов безопасного вызова
    return if (country != null) country else "Unknown"
}