package com.vk.axwer.kotlin.p6206

import com.vk.axwer.kotlin.p6103.Company

// 6.2.6. Тип Nothing: функция, которая не завершается
fun main() {
    val company = Company(name = "JetBrains", address = null)
    val address = company.address ?: fail("No address")
    println(address.city)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}