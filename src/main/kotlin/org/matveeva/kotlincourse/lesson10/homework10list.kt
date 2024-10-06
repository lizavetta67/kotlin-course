package org.matveeva.kotlincourse.lesson10

//Работа со списками List

fun main() {
    println("Задание 1 " + exOne())
    println("Задание 2 " + exTwo())
    println("Задание 3 " + exThree())
    println("Задание 4 " + exFor(mutableListOf(1, 2, 3)))
    println("Задание 5 " + exFive(mutableListOf("World", "World", "notWorld"), "World"))
    //println("Задание 6"+exSix(listOf(1,2,3)))
    println("Задание 7 " + exSeven(listOf("World", "World", "notWorld")))
    println("Задание 8 " + exEight(mutableListOf(1, 2, 3), 1, 99))
    println("Задание 9 " + exNine(listOf("w", "o", "r"), listOf("l", "d")))
    println("Задание 10 " + exTen(listOf(1, 2, 3, 4, 5, 6, 88)))
    println("Задание 11 " + exEl(listOf(1, 2, 3, 4, 5, 6, 88)))

}

fun exOne(): List<Int> {
    return listOf()
}

fun exTwo(): List<String> {
    return listOf("Hello", "World", "Kotlin")
}

fun exThree(): MutableList<Int> {
    return mutableListOf(1, 2, 3, 4, 5)
}

fun exFor(added: MutableList<Int>): MutableList<Int> {
    added.add(6)
    added.add(7)
    added.add(8)
    return added
}

fun exFive(lists: MutableList<String>, remover: String): MutableList<String> {
    lists.remove(remover)
    return lists
}

//fun exSix(i: List<Int>): List<Int> {
//    for(some in i){
//        println(some)
//    }
//}
fun exSeven(list: List<String>): String {
    return (if (list.size >= 2) {
        println(list[2])
    } else {
        println("Нет данных")
    }).toString()
}

fun exEight(i: MutableList<Int>, position: Int, newInt: Int): MutableList<Int> {
    if (position in i.indices) {
        i[position] = newInt
    }
    return i
}

fun exNine(i1: List<String>, i2: List<String>): List<String> {
    return i1.plus(i2)
}

fun exTen(a: List<Int>): Pair<Int, Int> {
    return Pair(a.min(), a.max())
}

fun exEl(d: List<Int>): List<Int> {
    val newlist = mutableListOf<Int>()
    for (e in d) {
        if (e % 2 == 0) {
            newlist.add(e)
        }
    }
    return newlist
}
