package com.vk.axwer.kotlin.p422

// 4.2.2. Вторичные конструкторы: различные способы инициализации суперкласса
fun main() {
    MyButton(Context())
    println("==========")
    MyButton(Context(), AttributeSet())
    println("==========")
    MyButton()
}

open class View {
    // Далее следуют вторичные конструкторы
    constructor(ctx: Context) {
        // некоторый код
        println("A")
    }
    constructor(ctx: Context, attr: AttributeSet) {
        // некоторый код
        println("B")
    }
    constructor() {
        // некоторый код
        println("C")
    }
}
open class MyButton : View {
    // Делегирует выполнение другому конструктору класса
    constructor(ctx: Context) : this(ctx, AttributeSet()) {
        // ...
        println("D")
    }
    // Вызов конструктора суперкласса
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        // ...
        println("E")
    }
    // Вызов конструктора суперкласса по умолчанию можно не указывать
    constructor() {
        // ...
        println("F")
    }
}

class Context
class AttributeSet