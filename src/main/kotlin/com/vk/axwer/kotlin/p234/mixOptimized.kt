package com.vk.axwer.kotlin.p234

import com.vk.axwer.kotlin.p232.Color
import com.vk.axwer.kotlin.p232.Color.*
import java.lang.Exception

// 2.3.4. Выражение "when" без аргументов
fun main() {
    println(mixOptimized(BLUE, YELLOW))
}

fun mixOptimized(c1: Color, c2: Color) =
        // Выражение "when" без аргумента
        when {
            (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
            (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
            (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
            else -> throw Exception("Dirty color")
        }