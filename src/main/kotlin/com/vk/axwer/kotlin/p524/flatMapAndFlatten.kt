package com.vk.axwer.kotlin.p524

// 5.2.4. Обработка элементов вложенных коллекций: функции flatMap и flatten
fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman"))
    )
    println(books.flatMap { it.authors }.toSet())

    val lists = listOf(listOf(1, 2, 3), listOf("one", "tro", "three"))
    println(lists.flatten())
}

class Book(val title: String, val authors: List<String>)