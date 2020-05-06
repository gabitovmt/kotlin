package com.vk.axwer.kotlin.p237

import com.vk.axwer.kotlin.p235.Expr
import com.vk.axwer.kotlin.p235.Num
import com.vk.axwer.kotlin.p235.Sum

// 2.3.7. Блоки в выражениях "if" и "when"
fun main() {
    // (1+2)+4
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// Оператор when с составными операциями в ветках
fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                // Это последнее выражение в блоке, функция вернёт его значение, если e имеет тип Num
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                // Функция вернёт значеение этого выражения, если e имеет тип Sum
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }