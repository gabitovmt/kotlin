package com.vk.axwer.kotlin.p425

// 4.2.5. Изменение видимости методов доступа
fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}

// Объявление свойства с приватным методом записи
class LengthCounter {
    var counter: Int = 0
        private set     // Значение этого свойства нельзя изменить вне класса

    fun addWord(word: String) {
        counter += word.length
    }
}