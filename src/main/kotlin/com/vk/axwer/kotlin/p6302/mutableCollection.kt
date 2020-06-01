package com.vk.axwer.kotlin.p6302

// 6.3.2. Изменяемые и неизменяемые коллекции
fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)

    val readOnlyTarget: Collection<Int> = arrayListOf(1)
//    copyElements(source, readOnlyTarget)  не скомпилируется
}

// Применение интерфейсов для чтения и изменения значений коллекции
fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)    // Добавление элементов в изменяемую целевую коллекцию
    }
}