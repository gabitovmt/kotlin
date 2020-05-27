package com.vk.axwer.kotlin.p618

// 6.1.8. Свойства с отложенной инициализацией
fun main() {
    val test = MyTest()
    test.setUp()
    test.testAction()
}

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    private lateinit var myService: MyService

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        if ("foo" != myService.performAction()) {
            throw Exception("testAction()")
        }
    }
}