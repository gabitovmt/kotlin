package com.vk.axwer.kotlin.p361.example4

import com.vk.axwer.kotlin.p361.example1.User
import java.lang.IllegalArgumentException

fun main() {
    saveUser(User(1, "", ""))
}

// Перемещение логики в функцию-расширение
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            // К свойствам класса User можно обращаться напрямую
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    // Вызов функции-расширения
    user.validateBeforeSave()

    // Сохранение информации о пользователе в базе данных
}