package com.vk.axwer.kotlin.p361.example3

import com.vk.axwer.kotlin.p361.example1.User
import java.lang.IllegalArgumentException

fun main() {
    saveUser(User(1, "", ""))
}

// Доступ к параметрам внешней функции из локальной функции
fun saveUser(user: User) {
    // Теперь не нужно дублировать параметр user в функции saveUser
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            // Можно напрямую обращаться к параметрам внешней функции
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Сохранение информации о пользователе в базе данных
}