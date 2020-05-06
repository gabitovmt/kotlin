package com.vk.axwer.kotlin.p232.anotherpackage

// Импорт класса Color, объявленный в другом пакете
import com.vk.axwer.kotlin.p232.Color
// Импорт констант перечисления для использования без квалификатора
import com.vk.axwer.kotlin.p232.Color.*

// Импорт констант перечисления для использования без квалификатора
fun main() {
    println(getWarmth(GREEN))
}

fun getWarmth(color: Color) = when(color) {
    // Явный импорт констант перечисления для обращения к ним по именам
    RED, ORANGE, YELLOW -> "тёплый"
    GREEN -> "нейтральный"
    BLUE, INDIGO, VIOLET -> "холодный"
}