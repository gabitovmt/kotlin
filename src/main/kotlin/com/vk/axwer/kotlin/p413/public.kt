package com.vk.axwer.kotlin.p413

import com.vk.axwer.kotlin.p411.Focusable

/*
    4.1.3. Модификаторы видимости: по умолчанию public

    Отличия от Java.
    1. Удалён модификатор по умолчанию.
    2. Добавлен модификатор "internal". Можно применять к членам класса и к объявлениям на верхнем уровне.
       Доступность - только в модуле. В Java он работать не будет. Модификатор будет по умолчанию.
    3. По умолчанию объявления и методы класса идут public.
    4. Модификатор private можно применить к объявлениям верхнего уровня. Такие объявления будут видны только в файле.
    5. protected - разрешено только в самом классе и в его подклассах. Пакеты здесь никакую роль не играют.
    6. Внешний класс не видит private членов внутренних и вложенных классов.
 */

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

/*// Ошибка: "публичный" член класса раскрывает internal "TalkativeButton"
fun TalkativeButton.giveSpeech() {
    // Ошибка: функция "yell" недоступна; в классе "TalkativeButton" она объявлена с модификатором "private"
    yell()
    // Ошибка: функция "whisper" недоступна; в классе "TalkativeButton" она объявлена с модификатором "protected"
    whisper()
}*/
