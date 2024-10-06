package org.matveeva.kotlincourse.lesson9

import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main(){
    var theTeacher = "Александр"
    var message = "С Днем Учителя!"
    val wishes = listOf("Умных учеников","Выполненых домашних заданий","Больше учеников")
    var dateOfBirth: String = "2024-10-02"
    var dateToday = LocalDate.now().toString()

    if(dateToday==dateOfBirth){
        println("$theTeacher, $message Больше всего желаю тебе " + wishes[0])
    } else {
        println("Я опоздала с поздравлениями)")
    }

}

