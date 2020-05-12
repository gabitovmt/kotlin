package com.vk.axwer.kotlin.p443

// 4.4.3. Объекты-компаньоны как обычные объекты
fun main() {
    // Для вызова метода fromJSON можно использовать оба подхода
    val person1 = Person.Loader.fromJSON("{name: 'Dmitry'}")
    val person2 = Person.fromJSON("{name: 'Brent'}")
    println(person1.name)
    println(person2.name)

    val user1 = User.Companion.fromJSON("{name: 'Alex'}")
    val user2 = User.fromJSON("{name: 'Dalvik'}")
    println(user1.name)
    println(user2.name)

    val man1 = Man.Companion.fromJSON("{name: 'Helen'}")
    val man2 = Man.fromJSON("{name: 'Alexandra'}")
    println(man1.name)
    println(man2.name)
}

// Объявление статического поля
@JvmField
val person = Person("Marat")

// Объявление именованного объекта-компаньона
class Person(val name: String) {
    companion object Loader {
        fun fromJSON(jsonText: String) = Person(getName(jsonText))

        // Объявление статического поля
        @JvmField
        val person = Person("Marat")
    }
}
// Объект компаньон без имени
class User(val name: String) {
    companion object {
        fun fromJSON(jsonText: String) = User(getName(jsonText))
    }
}
// Метод сделан статическим
class Man(val name: String) {
    companion object {
        @JvmStatic
        fun fromJSON(jsonText: String) = Man(getName(jsonText))
    }
}

fun getName(jsonText: String): String {
    val mathResult = """\{\s?name:\s?'(\w+)'\s?}""".toRegex()
            .matchEntire(jsonText) ?: throw NullPointerException()
    val (name) = mathResult.destructured
    return name
}