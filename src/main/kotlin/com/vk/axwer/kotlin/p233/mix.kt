package com.vk.axwer.kotlin.p233

import com.vk.axwer.kotlin.p232.Color
import com.vk.axwer.kotlin.p232.Color.*

// 2.3.3. Использование оператора "when" с произвольными объектами
fun main() {
    println(mix(BLUE, YELLOW))
}

// Использование различных объектов в ветках when
// Метод не очень оптимизированный, т.к. при каждом обращении создаются Set<Color>
fun mix(c1: Color, c2: Color) =
        // Перечисление пар цветов, пригодных для смешивания
        when (setOf(c1, c2)) {
            // Аргументом выражения "when" может быть любой объект. Он проверяется условными выражениями ветвей
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            // Выполняется, если не соответствует ни одной из ветвей
            else -> throw Exception("Грязный цвет")
        }