package com.vk.axwer.kotlin.p330

// 3.3. Добавление методов в сторонние классы: функции-расширения и свойства-расширения
fun main() {
    // String - тип-получатель, "Kotlin" - объект-получатель
    println("Kotlin".lastChar())
    println("Kotlin".last())
}

// String - тип-получатель, receiver type
// this - объект-получатель, receiver object
fun String.lastChar(): Char = this.get(this.length - 1)

// this можно опускать
fun String.last(): Char = get(length - 1)