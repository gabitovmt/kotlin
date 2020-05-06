package com.vk.axwer.kotlin.p242

// 2.4.2. Итерации по последовательности чисел: диапазоны и прогрессии
fun main() {
    // Применяется закрытый/включающий диапазон
    for (i in 1..30) {
        print(fizzBuzz(i))
    }
    println()

    // Итерация по диапазону с шагом
    for (i in 30 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    println()

    // Применяется полузакрытый диапазон
    for (i in 1 until 30) {
        print(fizzBuzz(i))
    }
    println()
}

// Применение оператора when в реализации игры Fizz-Buzz
fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}