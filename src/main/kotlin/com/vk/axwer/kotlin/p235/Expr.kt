package com.vk.axwer.kotlin.p235

// 2.3.5. Автоматическое приведение типов: совмещение проверки и приведения типа
fun main() {
    // (1+2)+4
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// Иерархия классов для представления выражений
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// Вычисления выражения с помощью каскада операторов if
fun eval(e: Expr): Int {
    if (e is Num) {
        // Явное приведение к типу Num здесь излишне
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        // Переменная e уже приведена к нужному типу!
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}