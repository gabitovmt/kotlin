package com.vk.axwer.kotlin.p424

// 4.2.4. Обращение к полю из методов доступа
fun main() {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}

// Доступ к полю из метода записи
class User(val name: String) {
    var address: String = "unspecified"
        set(value) {
            // Чтение значения из поля ($field)
            println("""
                Address was changed for $name:
                "$field" -> "$value".
            """.trimIndent())
            // Изменение значения поля
            field = value
        }
}