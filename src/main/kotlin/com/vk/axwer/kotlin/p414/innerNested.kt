package com.vk.axwer.kotlin.p414

// 4.1.4. Внутренние и вложенные классы: по умолчанию вложенные
fun main() {
    val outer = Outer()
    println(outer.test)
    Outer.Nested().printState()
    outer.Inner().printState()
}

class Outer {
    val test = "Hello, World!"

    // Вложенный класс. Аналог на Java: static class
    class Nested {
        fun printState() {
//            println(test) // Нет доступа к test, т.к. это вложенный класс
            println("Нет доступа к test")
        }
    }

    // Внутренний класс. Аналог на Java: class
    inner class Inner {
        fun printState() {
            println(test)
            println(this@Outer.test)    // или
        }
    }
}