package com.vk.axwer.kotlin.p6205

// 6.2.5. Тип Unit: тип "отсутствующего" значения
interface Processor<T> {
    fun process(): T
}
class NoResultProcessor : Processor<Unit> {
    override fun process() {    // Возвращает значение типа Unit, но в объявлении это не указано
        // Сделать что-то
        // Не требуется писать инструкцию return
    }
}