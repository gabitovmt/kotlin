package com.vk.axwer.kotlin.p231

// 2.3.1. Объявление классов перечислений
fun main() {
    println(Color.BLUE.rgb())
}

enum class Color(
        val r: Int, val g: Int, val b: Int      // Значения свойств определяются для каждой константы
) {
    // Объявления свойств констант перечисления
    RED(255, 0, 0), ORANGE(255, 165, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(0, 0, 255), INDIGO(75, 0, 130), VIOLET(238, 130, 238); // Точка с запятой обязательна

    // Определение метода класса перечисления
    fun rgb() = (r * 256 + g) * 256 + b
}