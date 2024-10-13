package org.matveeva.kotlincourse.lesson12

fun main(){
    println(ex1())
    println(ex2(2,2))
    println(ex3("Lala"))
    println(ex4(listOf(1,2,3)))
    println(ex5("Lalaa"))
    println(ex6())
    println(ex7(listOf(1, null)))
    println(ex8(5))
    println(ex9())
    println(ex10(null, null))


    println(multiplyByTwo(4))
    println(isEven(5))
    println(printNumbersUntil(6))
    println(findFirstNegative(listOf(1,2,4,-8)))
    println(processList(listOf("tt","ty")))
}

fun ex1(){
}
fun ex2(a:Int,a1: Int){
    println(a+a1)
}
fun ex3(b:String){
}
fun ex4(c: List<Int>){
    var avg = c.average().toDouble()
    println(avg)
}
//Напишите сигнатуру функции, которая принимает nullable
//строку и возвращает её длину в виде nullable целого числа.
fun ex5(d: String?){
    var nullableInit: Int? = d?.length
    println(nullableInit)
}
fun ex6(){
    var number : Float = 0.0f
    println(number)
}
//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun ex7(e: List<Int?>){
}
//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun ex8(e:Int) {
    var stroka : String? = ""
    println(stroka)
}
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun ex9() {
    var strokaWithNull : List<String?> = listOf("One","Two",null)
    println(strokaWithNull)
}
//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun ex10(f:String?, g:Int?) {

    var h : Boolean? = null
    println(h)
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(i: Int): Int {
    var i1 = i*2
    return i1
}
//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(k: Int): Boolean {
    var bB : Boolean
    if(k % 2 == 0){
        bB=true
    } else{
        bB=false
    }
    return bB
}
//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа
// от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) : Int? {
    for(some in 1..n){
        println(some)
    }
    return null
}
//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает
//первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(m: List<Int> ): Int? {
    var m1: Int? = m.min()
    if(m1!! < 0){
        m1
    } else{
        m1=null
    }
    return m1
}
//Задача 5:
//Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку. Если встречается null значение,
// функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(k: List<String?>) :String?{
    var kk: String? =null
    for (tt in k){
        println(tt)
    }
    return kk
}
