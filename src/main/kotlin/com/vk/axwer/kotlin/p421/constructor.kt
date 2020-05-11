package com.vk.axwer.kotlin.p421

// 4.2.1. Инициализация классов: основной конструктор и блоки инициализации
fun main() {
    val user1 = User1("User1")
    println(user1.nickname)

    val user2 = User2("User2")
    println(user2.nickname)

    val user3 = User3("User3")
    println(user3.nickname)

    // Использует значение параметра по умолчанию isSubscribed равное "true"
    val alice = User4("Alice")
    println(alice.isSubscribed)
    // Значения параметров можно передавать в порядке определения
    val bob = User4("Bob", false)
    println(bob.isSubscribed)
    // Можно явно указывать имена некоторых аргументов конструктора
    val carol = User4("Carol",isSubscribed = false)
    println(carol.isSubscribed)

    val user5 = User5()
    println("name: ${user5.nickname}, isSubscribed: ${user5.isSubscribed}")

    val user6: User = TwitterUser("User6")
    println(user6.nickname)

    val button = RadioButton()
    println(button)

    // Ошибка компиляции
//    val secretive = Secretive()
}

// Основной конструктор с одним параметром
class User1 constructor(nickname: String) {
    val nickname: String
    // Блок инициализации
    init {
        this.nickname = nickname
    }
}

// Если конструктор не имеет аннотаций и модификаторов доступа, то ключевое слово constructor можно опустить
class User2(nickname: String) {
    // Свойство инициализируется значением параметра
    val nickname = nickname
}

// "val" означает, что для параметра должно быть создано соответствующее свойство
class User3(val nickname: String)

class User4(
        val nickname: String,
        val isSubscribed: Boolean = true    // Значение по умолчанию для параметра конструктора
)

// Когда все параметры конструктора имеют значения по умолчанию, то будет создан дополнительно конструктор по умолчанию
class User5(val nickname: String = "default User", val isSubscribed: Boolean = true)

open class User(val nickname: String)
// Необходимо явно вызывать конструктор суперкласса
class TwitterUser(nickname: String) : User(nickname)

// Будет сгенерирован конструктор по умолчанию без аргументов
open class Button
// Конструктор по умолчанию у суперкласса всё равно нужно вызывать
class RadioButton: Button()

// Конструктор этого класса приватный
class Secretive private constructor()