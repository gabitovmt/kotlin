package com.vk.axwer.kotlin.p352

// 3.5.2. Регулярные выражения и строки в тройных кавычках
fun main() {
    val path = "/Users/yole/kotlin-book/chapter.adoc"
    parsePath1(path)
    parsePath2(path)
}

// Использование расширений класса String для работы с путями к файлам
fun parsePath1(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

// Использование регулярных выражений для разбора пути к файлу
fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}