package com.vk.axwer.kotlin.p411

// 4.1.1. Интерфейсы в Kotlin
fun main() {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

// Объявление простого интерфейса
interface Clickable {
    // Обычное объявление метода
    fun click()
    // Метод с реализацией по умолчанию
    fun showOff() = println("I'm clickable!")
}

// Другой интерфейс, реализующий тот же метод showOff()
interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable")
}

// Реализация простого интерфейса
class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    // Вы должны явно реализовать метод, если наследуется несколько его реализаций
    override fun showOff() {
        // Ключевое слово "super" с именем супертипа в угловых скобках определяет родителя, чей метод будет вызван
        // На Java это было бы так: Clickable.super.showOff()
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}