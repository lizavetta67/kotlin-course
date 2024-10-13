package org.matveeva.kotlincourse.lesson11

fun main(){
    println("Задание 1 Пустой словарь" + emptyMap())
    println("Задание 2 Не пустой словарь" + notEmptyMap())
    println("Задание 3 изменяемый Пустой словарь" + mutEmptyMap())
    println("Задание 4 Добавление Элементов в Словарь" + mutNotEmptyMap())
    println("Задание 5 Получение Значений из Словаря " + mutNotEmptyMap()[3])
    println("Задание 6 Удаление Элементов из Словаря" + deleteElementMap())
    println("Задание 7 Перебор Словаря в Цикле " + cycleMap(mutableMapOf(100.0 to 0)))
    println("Задание 8 Перезапись Элементов Словаря " + reWrite(1,"Перезапись"))
    println("Задание 9 Сложение Двух Словарей " + sumMaps(mutableMapOf(1 to "первый словарь"),mutableMapOf(3 to "второй словарь")))
    println("Задание 10 Словарь с Сложными Типами " + listMap())
    println("Задание 11 Словарь с Сложными Типами " + setMap(mutableMapOf(1 to mutableSetOf("первый словарь"))))
    println("Задание 12 Поиск Элемента по Значению " + findMap(mutableMapOf(Pair(5,4) to "YHYH")))

}

fun emptyMap(): Map<Int, Int> {
    val emptyOf = mapOf<Int,Int>()
    return emptyOf
}
fun notEmptyMap(): Map<Float, Double> {
    val a1 = 10.0f to 100.00
    val a2 = 100.0f to 10.00
    val notEmptyOf = mapOf(a1,a2)
    return notEmptyOf
}
fun mutEmptyMap(): MutableMap<Int, String> {
    val emptyOf = mutableMapOf<Int,String>()
    return emptyOf
}
fun mutNotEmptyMap(): MutableMap<Int, String> {
    val emptyOf = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    emptyOf[4]="D"
    return emptyOf
}
fun deleteElementMap(): MutableMap<Int, String> {
    val emptyOf = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    emptyOf.remove(3)
    return emptyOf
}

//Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
fun cycleMap(cycleMapVar: MutableMap<Double, Int>): Double {
    var result : Double = 0.0
    for(entries in cycleMapVar) {
        if((entries.key / entries.value).toDouble() == 0.0){
            print("бесконечность")
        } else {
            result = (entries.key / entries.value).toDouble()
        }
    }
    return result
}

fun reWrite(b1:Int, b2:String): MutableMap<Int, String> {
    var vocabulary = mutableMapOf<Int, String>(1 to "A", 2 to "B", 3 to "C")
    vocabulary[b1]=b2
    return vocabulary
}

fun sumMaps(c1:MutableMap<Int, String>, c2:MutableMap<Int, String>): MutableMap<Int, String> {
    var newMap = c1 + c2
    return newMap.toMutableMap()
}

fun listMap(): MutableMap<String, List<Int>> {
    val emptyOf = mutableMapOf( "A" to listOf(1,2), "B" to listOf(3,4), "C" to listOf(5,6))
    return emptyOf
}
fun setMap(d1: MutableMap<Int, MutableSet<String>>): MutableSet<String> {
    println(d1[1])
    d1[1]!!.add("Добавлено")
    return d1[1]!!.toMutableSet()
}
fun findMap(e1:  MutableMap<Pair<Int,Int>, String>): String {
    for((e11,e12) in e1){
        if(e11.first == 5 || e11.second == 5){
            println("Нашлось $e11 : $e12")
        }
    }
    return "не Нашлось"
}




