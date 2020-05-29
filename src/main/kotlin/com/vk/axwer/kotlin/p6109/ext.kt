package com.vk.axwer.kotlin.p6109

// 6.1.9. Расширение типов с поддержкой null
fun main() {
    verifyUserInput(" ")
    verifyUserInput(null)

    var num: String? = null
    println(num.isDigit())
    num = "737"
    println(num.isDigit())
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun String?.isDigit() =
        this != null && """^\d+$""".toRegex().matches(this)