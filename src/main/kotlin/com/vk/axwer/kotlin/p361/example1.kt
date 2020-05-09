package com.vk.axwer.kotlin.p361.example1

import java.lang.IllegalArgumentException

// 3.6. Чистим код: локальные функции и расширения
fun main() {
    saveUser(User(1, "", ""))
}

class User(val id: Int, val name: String, val address: String)

// Функция с повторяющимся кодом
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }

    // Сохранение информации о пользователе в базе данных
}