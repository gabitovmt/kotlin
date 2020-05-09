package com.vk.axwer.kotlin.p361.example2

import com.vk.axwer.kotlin.p361.example1.User
import java.lang.IllegalArgumentException

fun main() {
    saveUser(User(1, "", ""))
}

// Извлечение локальной функции для предотвращения дублирования
fun saveUser(user: User) {
    // Объявление локальной функции для проверки произвольного поля
    fun validate(user: User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    // Вызов функции для проверки конкретных полей
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // Сохранение информации о пользователе в базе данных
}