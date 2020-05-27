package com.vk.axwer.kotlin.p615

// 6.1.5. Безопасное приведение типов: оператор "as?"
fun main() {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(p2))
}

// Использование оператора безопасного приведения для реализации метода equals
class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? Person ?: return false // Проверит тип и вернёт false, если указанный тип недопустим

        return otherPerson.firstName == firstName && otherPerson.lastName == lastName
    }

    override fun hashCode(): Int = firstName.hashCode() * 37 + lastName.hashCode()
}