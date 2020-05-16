package com.vk.axwer.kotlin.p513

import com.vk.axwer.kotlin.p512.Person

// 5.1.3. Синтаксис лямбда-выражений
fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2)); // Вызов лямбда-выражения, хранящегося в переменной

    // Вызов лямбда выражения напрямую
    { println(42) }()

    // Выполняет код лямбда-выражения
    run { println(42) }

    // Применение синтаксических сокращений
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy({ p: Person -> p.age }))
    println(people.maxBy({ p -> p.age }))   // Тип параметра выводится из контекста
    println(people.maxBy({ it.age }))       // "it" - автоматически сгенерированное имя параметра
    println(people.maxBy() { it.age })
    println(people.maxBy { it.age })

    // Без контекста компилятор не сможет вывести тип параметра. Поэтому его нужно указывать
    val getAge = { p: Person -> p.age }
    println(people.maxBy(getAge))

    // Передача лямбда-выражения в именованном аргументе
    var names = people.joinToString(separator = " ", transform = { it.name })
    println(names)

    // Передача лямбда-выражения за скобками
    names = people.joinToString(" ") { it.name }
    println(names)

    // Лямбда-выражение из нескольких инструкций
    val mul = { x: Int, y: Int ->
        println("Computing the mul of $x and $y ...")
        x * y
    }
    println(mul(4, 5))
}