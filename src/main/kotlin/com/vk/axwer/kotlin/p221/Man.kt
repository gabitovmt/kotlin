package com.vk.axwer.kotlin.p221

class Man(
        val name: String,       // Неизменяемое свойство: для него будут созданы поле и простой метод чтения
        var isMarried: Boolean  // Изменяемое свойство: поле,методы чтения и записи
)