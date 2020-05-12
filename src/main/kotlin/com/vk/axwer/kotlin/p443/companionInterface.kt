package com.vk.axwer.kotlin.p443

// Реализация интерфейса в объекте-компаньоне
fun main() {
    val jsonFactory: JSONFactory<Woman> = Woman // Передача объекта-компаньона в функцию
    val woman = jsonFactory.fromJSON("{name:'Alina'}")
    println(woman.name)
}

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}
class Woman(val name: String) {
    // Объект-компаньон, реализующий интерфейс
    companion object : JSONFactory<Woman> {
        override fun fromJSON(jsonText: String) = Woman(getName(jsonText))
    }
}