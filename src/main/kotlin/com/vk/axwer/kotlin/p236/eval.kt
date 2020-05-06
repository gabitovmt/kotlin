package com.vk.axwer.kotlin.p236

import com.vk.axwer.kotlin.p235.Expr
import com.vk.axwer.kotlin.p235.Num
import com.vk.axwer.kotlin.p235.Sum

// 2.3.6. Рефакторинг: замена "if" на "when"
fun main() {
    // 1+2
    println(evalIf(Sum(Num(1), Num(2))))
    println(evalWhen(Sum(Num(1), Num(2))))
}

// Использование выражения if, возвращающего значения
fun evalIf(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            evalIf(e.right) + evalIf(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

// Использование when вместо каскада выражений if
fun evalWhen(e: Expr): Int =
        when (e) {
            // Ветка "when" проверяет тип аргумента и используется автоматическое приведение типов
            is Num -> e.value
            is Sum -> evalWhen(e.right) + evalWhen(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }