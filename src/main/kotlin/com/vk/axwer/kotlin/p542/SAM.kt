package com.vk.axwer.kotlin.p542

// 5.4.2. SAM-конструкторы: явное преобразование лямбда-выражений в функциональные интерфейсы
fun main() {
    createAllDoneRunnable().run()

    val runnable = Runnable { println("Hello, world!") }
    runnable.run()
}

// Применение SAM-конструктора к возвращаемому значению
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}
