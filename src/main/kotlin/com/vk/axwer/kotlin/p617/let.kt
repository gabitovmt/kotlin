package com.vk.axwer.kotlin.p617

// 6.1.7. Функция let
fun main() {
    // Применение функции let для вызова функции, не принимающей null
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
}

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}