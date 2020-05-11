package com.vk.axwer.kotlin.p423

// 4.2.3. Реализация свойств, объявленных в интерфейсах
fun main() {
    val alice: User = PrivateUser("Alice")
    val bob: User = SubscribingUser("bob@mail.com")
    val charles: User = FacebookUser(1)
    println(alice.nickname)
    println(bob.nickname)
    println(charles.nickname)

    val david: AdditionalUser = AdditionalUserImpl("david@gmail.com")
    println("""Nickname: "${david.nickname}", email: "${david.email}"""")
}

interface User {
    val nickname: String
}

// Реализация свойства интерфейса
class PrivateUser(override val nickname: String) : User // Свойство основного конструктора
class SubscribingUser(val email: String) : User {
    // Собственный метод чтения
    override val nickname: String
        get() = email.substringBefore('@').capitalize()
}
class FacebookUser(val accountId: Int) : User {
    override val nickname = // Инициализация свойства
            getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String {
    return "Charles"
}

// Интерфейс может содержать свойства с методами чтения и записи
interface AdditionalUser {
    val email: String
    val nickname: String
        // Свойство не имеет поля для хранения значения: результат вычисляется при каждой попытке доступа
        get() = email.substringBefore('@')
}
class AdditionalUserImpl(override val email: String) : AdditionalUser