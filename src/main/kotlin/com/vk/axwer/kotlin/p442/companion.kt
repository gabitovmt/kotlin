package com.vk.axwer.kotlin.p442

// 4.4.2. Объекты-компаньоны: место для фабричных методов и статических членов класса
fun main() {
    A.bar()

    val bob = User.newSubscribingUser("bob@gmail.com")
    val alice = User.newSimpleUser("Alice")
    println(bob.nickname)
    println(alice.nickname)
}

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

// Замещение вторичных конструкторов фабричными методами
class User private constructor(val nickname: String) {  // Основной конструктор объявлен приватным
    // Объявление объекта-компаньона
    companion object {
        // Фабричный метод создаёт нового пользователя на основе email
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@').capitalize())
        fun newSimpleUser(nickname: String) =
                User(nickname)
    }
}