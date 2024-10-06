package org.matveeva.kotlincourse.lesson10

//Работа с массивами Array
fun main() {
    val numbers = arrayOf<Int>(1, 2, 3, 4, 5)
    println("Задание 1 \n" + numbers.toList())
    val emptyArray = Array(10) { "" }
    println("Задание 2 \n" + emptyArray.toList())
    val emptyArray1 = Array(5) { 0.0 }
    emptyArray1[0] = 1.0
    for (i in emptyArray1.indices) {
        emptyArray1[i] = (i + 1) * 2.0
    }
    println("Задание 3 \n" + emptyArray1.toList())
    val numbers1 = arrayOf<Int>(1, 2, 3, 4, 5)
    for (a in numbers1.indices) {
        numbers1[a] = a * 3
    }
    println("Задание 4 \n" + numbers1.toList())
    val emptyNullableArray: Array<String?> = arrayOfNulls<String>(3)
    emptyNullableArray[1] = "Konlin"
    emptyNullableArray[2] = "for Superman"
    println("Задание 5 \n" + emptyNullableArray.toList())
    val numbers2 = arrayOf<Int>(1, 2, 3, 4, 5)
    val myNewArray = Array(5) { 0 }
    for (c in numbers2.indices) {
        myNewArray[c]
    }
    print("Задание 6 \n" + myNewArray.toList())
    val numbers3 = arrayOf<Int>(1, 2, 3, 4, 5)
    val numbers4 = arrayOf<Int>(1, 2, 3)
    val numbersDiff = numbers3.size - numbers4.size
    println("Задание 7 \n $numbersDiff")
//    val numbers5 = arrayOf<Int>(1, 2, 3, 4, 5)
//    val numberOfArray = 5
//    //println(numbers5.elementAtOrNull(5))
//    while(numbers5.elementAtOrNull(numberOfArray)==null){
//        print("-1")
//    }
//    println(numbers5.toList())

    println("Задание 9")
    val numbers6 = arrayOf<Int>(1, 2, 3, 4, 5)
    for (letter in numbers6) {
        if (letter % 2 == 0) {
            println("четное $letter")
        } else {
            println("нечетное $letter")
        }
    }
    //Задание 10:
    println("Задание 10 Ответ:" + newSearch(arrayOf("ad", "tt", "tee"), "tt"))
}

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Верни найденный элемент из функции в виде строки.

fun newSearch(array: Array<String>, search: String): String? {
    for (ii in array) {
        if (ii.contains(search)) {
            return ii
        }
    }
    return null
}

