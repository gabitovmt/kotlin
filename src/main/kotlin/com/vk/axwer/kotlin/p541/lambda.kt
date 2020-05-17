package com.vk.axwer.kotlin.p541

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

// 5.4.1. Передача лямбда-выражения в Java-метод
fun main() {
    val executor: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor()

    // Передача объекта-выражения в качестве реализации функционального интерфейса.
    // Важно. При каждом исполнении данного кода будет создаваться объект
    executor.schedule(object : Runnable {
        override fun run() {
            println(1)
        }
    }, 1, TimeUnit.SECONDS)

    // В программе будет создан только один экземпляр интерфейса Runnable
    executor.schedule({ println(2) }, 1, TimeUnit.SECONDS)

    // В каждый вызов метода schedule будет передаваться один и тот же экземпляр
    executor.schedule(runnable, 1, TimeUnit.SECONDS)

    fun execute(id: Int) {
        // Лямбда-выражение захватывает переменную "id".
        // Для каждого вызова execute создаётся новый экземпляр Runnable
        executor.schedule({ println(id) },1, TimeUnit.SECONDS)
    }
    execute(4)

    executor.shutdown()

    /**
     * Всё вышеперечисленное актуально для Java-методов, принимающих функциональные интерфейсы.
     * Если передавать лямбда-выражения в функцию на Kotlin, отмеченную ключевым словом inline, анонимный класс
     * не будет создаваться.
     */
}

// Компилируется в глобальную переменную; в программе существует только один экземпляр
val runnable = Runnable { println(3) }