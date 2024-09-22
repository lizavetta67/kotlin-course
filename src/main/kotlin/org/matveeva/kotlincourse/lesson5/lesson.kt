package org.matveeva.kotlincourse.lesson5

fun main() {
    val sum = "10" + "5"
    val diff = 10 + 5
    val product =10*5
    val quo = 10/5
    val remainder = 10%5
    val remainder1 = 10%6
    val isEqual =( 5 == 5)
    val andResult = false && false
    val andResult1 = false || false
    val notResult =!(5>3)
    var number = 5
    number+= 5
    number++

    var name: String? = null
    val res = if (name==null) {
        "Unknown"
    } else{
        name
    }

    //val result = name ?: "Unknown"
    //val result = name ?: throw IllegalArgumentException("Unknown")

    println(number++)
    println(number)
}

