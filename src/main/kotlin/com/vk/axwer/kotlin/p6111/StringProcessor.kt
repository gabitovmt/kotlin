package com.vk.axwer.kotlin.p6111

// Реализация Java-интерфейса с поддержкой и без поддержки null
class StringPrinter : StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}
class NullableStringPrinter : StringProcessor {
    override fun process(value: String?) {
        if (value != null) {
            println(value)
        }
    }
}