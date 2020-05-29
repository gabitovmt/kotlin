package com.vk.axwer.kotlin.p6201

// 6.2.1. Примитивные типы: Int, Boolean и другие
fun main() {
    showProgress(146)
}

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're $percent% done!")
}