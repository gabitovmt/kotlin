package com.vk.axwer.kotlin.p433

// 4.3.3. Делегирование в классах. Ключевое слово by
fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}

class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {  // Делегирование реализации MutableCollection объекту в поле innerSet
    var objectsAdded = 0

    // Собственная реализация вместо делегирования
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }
    // Собственная реализация вместо делегирования
    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}