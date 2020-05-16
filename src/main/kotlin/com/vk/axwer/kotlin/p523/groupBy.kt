package com.vk.axwer.kotlin.p523

import com.vk.axwer.kotlin.p521.Person

// 5.2.3. Группировка значений в списке с функцией groupBy
fun main() {
    val people = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    val byAges: Map<Int, List<Person>> = people.groupBy { it.age }
    println(byAges)

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}