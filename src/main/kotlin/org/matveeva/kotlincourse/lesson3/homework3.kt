package org.matveeva.kotlincourse.lesson3

import sun.jvm.hotspot.ci.ciField
//Примеры всех переменных
val name: String = "Alice"
var age: Double = 30.0
const val PI = 3.34
lateinit var userInfo: String
val lazyValue: String by lazy {
    "Hello world!"
}
var speed: Double? = null
var count: Int = 0
    get() = field
    set(value) {
        if (value >=1) field=value
    }
// Домашнее задание
// изменяемость, обязательность, возможность начальной установки,
// ресурсоёмкие вычисления значения,
// необходимость проверки устанавливаемого значения на валидность или
// запрет доступа на установку при возможности чтения,
// публичность и приватность данных.


//Название мероприятия. Может быть изменено.
var eventname: String = "Hackathon Survival"
//Дата проведения
var dateevent: String = "2020-01-01 00:00:00"
//Место проведения
var localevent: String = "г. Москва"
//Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие
val budget: String by lazy {
    "Here will be budget"
}
//Количество участников
var members: Int = 0
    get() = field
    set(value) {
        if (value >=1000) print("Места не хватит всем")
        else field=value
    }
//Длительность хакатона
var duration: Int = 2
//Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
var contacts: String = "blabla@gmail.com Телефон для связи +7(999)888-77-55"
lateinit var confirmInfo: String
//Текущее состояние хакатона (статус)
var status: String = "Start"
//Список спонсоров
var sponsorarray: Array<String> = arrayOf("Ростех", "Министерство образования", "ООО 'Инвестиции'")
//Бюджет мероприятия
var budgetinfo: Double = 0.0
//Текущий уровень доступа к интернету???

//Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
//Количество команд
var countteam: Double = 0.0
//Перечень задач
