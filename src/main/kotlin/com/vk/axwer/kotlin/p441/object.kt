package com.vk.axwer.kotlin.p441

import java.io.File

// 4.4.1. Объявление объекта: простая реализация шаблона "Одиночка"
fun main() {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}

// Реализация интерфейса Comparator с помощью объявления объекта
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

// Реализация интерфейса Comparator как вложенного объекта
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
                p1.name.compareTo(p2.name)
    }
}