package com.vk.axwer.kotlin.p6305

// 6.3.5. Массивы объектов и примитивных типов

// Использование массивов
fun main(args: Array<String>) {
    for (i in args.indices) {   // Использование свойства-расширения array.indices для обхода диапазона индексов
        println("Argument $i is: ${args[i]}")   // Обращение к элементу по индексу array[index]
    }

    // Создание массива строк
    val letters = Array<String>(26) { i -> ('a' + i).toString() }
    println(letters.joinToString(""))

    // Передача коллекции в метод, принимающий vararg
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray())) // Для передачи массива в метод, ожидающий vararg, применяется
                                                        // оператор развёртывания (*)

    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
    println(fiveZeros.contentToString())
    println(fiveZerosToo.contentToString())

    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())

    // Применение функции forEachIndexed к массиву
    args.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}