package com.vk.axwer.kotlin.p343

// 3.4.3. Работа с парами: инфиксные вызовыи мультидекларации
fun main() {
    val pair1 = 1.to("one") // Вызов функции to обычным способом
    val pair2 = 2 to "two"       // Вызов функции to с использованием инфиксной нотации
    println(pair1)
    println(pair2)

    val (number, name) = 1 to "one"
    println(number)
    println(name)

    val list = listOf("zero", "one", "two", "three", "four")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}