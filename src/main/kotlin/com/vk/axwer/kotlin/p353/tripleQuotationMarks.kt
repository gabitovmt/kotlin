package com.vk.axwer.kotlin.p353

// 3.5.3. Многострочные литералы в тройных кавычках
fun main() {
    val kotlinLogo = """| //
                       .|//
                       .|/\""".trimMargin(".")
    println(kotlinLogo)

    val path1 = "C:\\Users\\yole\\kotlin-book"
    val path2 = """C:\Users\yole\kotlin-book"""
    println(path1)
    println(path2)

    val price1 = "$99.9"
    val price2 = """$99.9"""
    println(price1)
    println(price2)

    val dollar1 = "\$dollar"
    val dollar2 = """${'$'}dollar"""
    println(dollar1)
    println(dollar2)
}