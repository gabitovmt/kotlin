package com.vk.axwer.kotlin.p222

// 2.2.2. Собственные методы доступа
fun main() {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
    println(rectangle.square)
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        // Объявление метода чтения для свойства
    get() {
        return height == width
    }

    val square: Int
        // Объявление метода чтения для свойства
    get() = height * width
}