package com.vk.axwer.kotlin.p415.example2

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// Выражения в виде запечатанных классов
sealed class Expr {
    // В Kotlin 1.0 все подклассы должны были быть в качестве вложенных.
    // В Kotlin 1.1 не обязательно, главное, чтобы они были в одном и том же файле.
//    class Num(val value: Int) : Expr()
//    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
        when (e) {
            // Выражение "when" охватывает все возможные варианты, поэтому ветка "else" не нужна
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
        }

class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()