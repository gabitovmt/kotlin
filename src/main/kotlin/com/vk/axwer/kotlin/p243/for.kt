package com.vk.axwer.kotlin.p243

import java.util.*

// 2.4.3. Итерации по элементам словарей
fun main() {
    // Создание словаря и обход его элементов
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary  // Сохраняет в словаре значение binary ключом в c
    }
    // Обход элементов словаря; ключ и значение присваиваются двум переменным
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    // Обход коллекции с сохранением индекса
    val list= arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}