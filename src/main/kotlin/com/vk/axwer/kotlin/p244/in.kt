package com.vk.axwer.kotlin.p244

// 2.4.4. Использование "in" для проверки вхождения в диапазон или коллекцию
fun main() {
    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('8'))

    // То же, что и "Java" <= "Kotlin" && "Kotlin" <= "Scala"
    // Используется интерфейс java.lang.Comparable
    println("Kotlin" in "Java".."Scala")

    println("Kotlin" in setOf("Java", "Scala"))
}

// Проверка вхождения в диапазон с помощью in
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

// Использование проверки in в ветках when
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'.. 'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}