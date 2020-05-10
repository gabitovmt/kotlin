package com.vk.axwer.kotlin.p415.exampl1

import java.lang.IllegalArgumentException

// 4.1.5. Запечатанные классы: определение жёстко заданных иерархий
fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// Реализация выражения как интерфейса
interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            // Необходимо также проверять ветку "else"
            else -> throw IllegalArgumentException("Unknown expression")
        }