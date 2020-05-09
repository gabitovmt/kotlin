package com.vk.axwer.kotlin.p351

// 3.5.1. Разбиение строк
fun main() {
    println("12.345-6.A".split("[.\\-]".toRegex()))
    println("12.345-6.A".split(".", "-"))
}