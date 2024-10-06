package org.matveeva.kotlincourse.lesson10

//Работа с Множествами Set
fun main() {
    println("задание 1" + setOne())
    println("задание 2" + setTwo())
    println("задание 3" + setThree())
    println("задание 4" + setFoor(setThree()))
    println("задание 5" + setFive(mutableSetOf(1, 2, 3, 4, 5), 3))
    println("задание 6" + setSix(setOf(100, 50, 0)))
    println("задание 7 " + setSeven(setOf("Учитель", "можно", "не", "делать Дз"), "можно"))
    println("задание 8 " + exEight(mutableSetOf("Учитель", "можно"), mutableSetOf("не", "делать Дз")))
    println("задание 9 " + exNine(setOf(1, 2, 3), setOf(3, 4, 5)))
    println("задание 10 " + exTen(setOf("Kotlin", "Java", "Scala"), setOf("Kotlin", "Java", "TTT")))
}

fun setOne(): Set<Int> {
    return setOf()
}

fun setTwo(): Set<Int> {
    return setOf(1, 2, 3)
}

fun setThree(): MutableSet<String> {
    return mutableSetOf("Kotlin", "Java", "Scala")
}

fun setFoor(i: MutableSet<String>): MutableSet<String> {
    i.add("Swift")
    i.add("Go")
    return i
}

fun setFive(ii: MutableSet<Int>, remover: Int): MutableSet<Int> {
    ii.remove(remover)
    return ii
}

fun setSix(i1: Set<Int>) {
    for (some in i1) {
        println("| $some |")
    }
}

fun setSeven(i2: Set<String>, check: String): Boolean {
    for (somes in i2) {
        if (somes == check) {
            return true
        }
    }
    return false
}

fun exEight(set1: MutableSet<String>, set2: MutableSet<String>): MutableSet<String> {
    return set1.plus(set2) as MutableSet<String>
}

fun exNine(set11: Set<Int>, set22: Set<Int>): Set<Int> {
    val newlist = mutableListOf<Int>()
    for (set11 in set22) {
        newlist.add(set11)
    }
    return set11
}
fun exTen(set111: Set<String>, set222: Set<String>): Set<String> {
    return set111 subtract set222
}
