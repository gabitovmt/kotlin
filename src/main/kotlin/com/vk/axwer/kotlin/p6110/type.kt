package com.vk.axwer.kotlin.p6110

// 6.1.10. Типовые параметры с поддержкой null
fun main() {
    printHashCode(null)
    printHashCode(42)
//    printHashCodeSafe(null)   Не скомпилируется
    printHashCodeSafe(42)
}

// Работа с параметром типа, допускающим значение null
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

// Объявление верхней границы, не допускающей null для параметра типа
fun <T: Any> printHashCodeSafe(t: T) {
    println(t.hashCode())
}