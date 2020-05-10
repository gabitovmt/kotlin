package com.vk.axwer.kotlin.p412

import com.vk.axwer.kotlin.p411.Clickable

// 4.1.2. Модификаторы open, final и abstract: по умолчанию final

/*
    final, open и abstract в интерфейсах не используются. Все методы в интерфейсах open и их нельзя сделать final.

    final - не может быть переопределён - применяется к членам класса по умолчанию.
    open - может быть переопределён - должен указываться явно.
    abstract - должен быть переопределён - используется только в абстрактных классах.
    override - переопределяет метод суперкласса или интерфейса - по умолчанию переопределяются метод открыт.
 */

fun main() {
    val richButton = RichButton()
    richButton.disable()
    richButton.animate()
    richButton.click()

    val richButton2 = RichButton2()
    richButton2.click()
}

// Объявление открытого класса с открытым методом
open class RichButton : Clickable {
    // Это закрытая функция: её невозможно переопределить в подклассе
    fun disable() = println("disable")
    // Это открытая функция: её можно переопределить в подклассе
    open fun animate() = println("animate")
    // Переопределение открытой функции также является открытым
    override fun click() = println("click")
}

// Запрет переопределения
open class RichButton2 : Clickable {
    // Ключевое слово "final" здесь не лишнее, потому что модификатор "override" без "final" означает,
    // что метод останется открытым
    final override fun click() = println("There was a click")
}

// Объявление абстрактного класса
// Это абстрактный класс: нельзя создать его экземпляр
abstract class Animated {
    // Это абстрактная функция: она не имеет реализации и должна быть переопределена в подклассах
    abstract fun animate()
    // Конкретные функции в абстрактных классах по умолчанию закрыты, но их можно сделать открытыми
    open fun stopAnimating() {}
    fun animateTwice() {}
}