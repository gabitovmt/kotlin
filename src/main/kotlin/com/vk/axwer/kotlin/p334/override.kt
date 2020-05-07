package com.vk.axwer.kotlin.p334

// 3.3.4. Функции-расширения не переопределяются
fun main() {
    val view: View = Button()
    view.click()
    view.showOff()
}

// Переопределение функции-члена класса
open class View {
    open fun click() = println("View clicked")
    fun show() = println("View is showed")
}
class Button: View() {
    override fun click() = println("Button clicked")
}

// Функции-расширения не переопределяются
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

// Функции-расширения не переопределяют методы класса
fun View.show() = println("View has been showed")