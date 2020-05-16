package com.vk.axwer.kotlin.p514

// 5.1.4. Доступ к переменным из контекста
fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}

// Использование параметров функции в лямбда-выражении
fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")  // Обращение к параметру "prefix" из лямбда-выражения
    }
}

// Изменение локальных переменных внутри лямбда-выражения
fun printProblemCounts(responses: Collection<String>) {
    // Объявление переменных, к которым будет обращаться лямбда-выражение
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++      // Изменение переменных внутри лямбда-выражения
        } else if (it.startsWith("5")) {
            serverErrors++      // Изменение переменных внутри лямбда-выражения
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}