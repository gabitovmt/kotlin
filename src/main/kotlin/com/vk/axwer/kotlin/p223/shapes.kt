package com.vk.axwer.kotlin.p223.shapes
// Объявление пакета. Имя пакета не обязательно может соблюдать структуру папок

// Импорт класса из стандартной библиотеки Java
import java.util.*  // Можно использовать импорт со звёздочкой

class Rectangle(val height: Int, val width: Int) {
    val square: Int
        get() = height * width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}