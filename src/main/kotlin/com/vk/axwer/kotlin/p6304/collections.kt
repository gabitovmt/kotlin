package com.vk.axwer.kotlin.p6304

import java.io.File

// 6.3.4. Коллекции как платформенные типы

// Реализация интерфейса FileContentProcessor в Kotlin
class FileIndexer : FileContentProcessor {
    /*
        - Ссылка на список может оказаться пустой, поскольку существуют двоичные файлы, которые нельзя представить
          в виде текста.
        - Элементы в списке не могут хранить null, поскольку строки в файле никогда не имеют значения null.
        - Список доступен только для чтения, поскольку представляет неизменяемое содержимое файла.
     */
    override fun processContents(path: File, binaryContents: ByteArray?, textContents: List<String>?) {
        // ...
    }
}

// Реализация интерфейса DataParser на языке Kotlin
class PersonParser : DataParser<Person> {
    /*
        - Список List<String> не может быть пустой ссылкой, поскольку вызывающий код всегда должен получать сообщения
          об ошибках.
        - Среди элементов списка может оказаться значение null, поскольку не все элементы в выходном списке будут иметь
          связанные с ними сообщения об ошибках.
        - Список List<String> будет изменяемым, поскольку реализация должна добавлять в него элементы.
     */
    override fun parseData(input: String, output: MutableList<Person>, errors: MutableList<String?>) {
        // ...
    }
}

data class Person(val name: String)