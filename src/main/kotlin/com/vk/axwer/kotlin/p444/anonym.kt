package com.vk.axwer.kotlin.p444

// 4.4.4. Объекты-выражения: другой способ реализации анонимных внутренних классов
fun main() {
    val window = Window()
    // Реализация обработчика событий с помощью анонимного класса
    window.addEventListener(
            // Объявление анонимного объекта, наследующего MouseAdapter
            object : MouseAdapter {
                // Переопределение методов MouseAdapter
                override fun mouseClicked(e: MouseEvent) = println("click")
                override fun mouseEntered(e: MouseEvent) = println("enter")
            }
    )
    window.click()

    val listener = object : MouseAdapter {
        override fun mouseClicked(e: MouseEvent) = println("click")
        override fun mouseEntered(e: MouseEvent) = println("enter")
    }
    listener.mouseClicked(object : MouseEvent {})
    listener.mouseEntered(object : MouseEvent {})

    // Доступ к локальным переменным из анонимного объекта
    var clickCount = 0
    window.addEventListener(object : MouseAdapter {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++    // На Java clickCount должен быть final. Поэтому изменять его нельзя
        }

        override fun mouseEntered(e: MouseEvent) {
            // ..
        }
    })
    window.click()
    window.click()
    println(clickCount)
}

class Window() {
    private val mouseAdapters: MutableCollection<MouseAdapter> = mutableListOf()

    fun addEventListener(mouseAdapter: MouseAdapter) {
        mouseAdapters.add(mouseAdapter)
    }
    fun click() {
        mouseAdapters.forEach { it.mouseClicked(object : MouseEvent {}) }
    }
}
interface MouseAdapter {
    fun mouseClicked(e: MouseEvent)
    fun mouseEntered(e: MouseEvent)
}
interface MouseEvent