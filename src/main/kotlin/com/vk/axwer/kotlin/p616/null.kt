package com.vk.axwer.kotlin.p616

import com.vk.axwer.kotlin.p613.Person

// 6.1.6. Проверка на null: утверждение "!!"
fun main() {
    ignoreNulls(null)

    val person = Person("Axwer", null)
    // Не пишите такой код!! Т.к. не понятно будет при KotlinNullPointerException, какое значение было null
    val country = person.company!!.address!!.country
}

// Использование утверждения о невозможности значения null
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}