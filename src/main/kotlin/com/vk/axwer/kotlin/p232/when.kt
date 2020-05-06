package com.vk.axwer.kotlin.p232

// 2.3.2. Использование оператора "when"  классами перечислений
fun main() {
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))
}

// Применение when для выбора правильного значения перечисления
fun getMnemonic(color: Color) =     // Сразу возвращает выражение "when"
        when (color) {
            Color.RED -> "Каждый"
            Color.ORANGE -> "Охотник"
            Color.YELLOW -> "Желает"
            Color.GREEN -> "Знать"
            Color.BLUE -> "Где"
            Color.INDIGO -> "Сидит"
            Color.VIOLET -> "Фазан"
        }

// Объединение вариантов в одну ветку when
fun getWarmth(color: Color) = when(color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "тёплый"
    Color.GREEN -> "нейтральный"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "холодный"
}