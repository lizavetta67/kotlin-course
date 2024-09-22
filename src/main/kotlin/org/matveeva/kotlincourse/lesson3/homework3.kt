//package org.matveeva.kotlincourse.lesson3
//
//import sun.jvm.hotspot.ci.ciField
////Примеры всех переменных
//val name: String = "Alice"
//var age: Double = 30.0
//const val PI = 3.34
//lateinit var userInfo: String
//val lazyValue: String by lazy {
//    "Hello world!"
//}
//var speed: Double? = null
//var count: Int = 0
//    get() = field
//    set(value) {
//        if (value >=1) field=value
//    }
//// Домашнее задание
//
////Название мероприятия. Может быть изменено.
//var eventName: String = "Hackathon Survival"
////Дата проведения
//var dateEvent: String = "2020-01-01 00:00:00"
////Место проведения
//var localEvent: String = "г. Москва"
////Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие
//private val budget: String by lazy {
//    "Here will be budget"
//}
////Количество участников
//var members: Int = 0
//    get() = field
//    private set(value) {field=value}
////Длительность хакатона
//var duration: Long = 2*60*60
////Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
//private lateinit var confirmInfo: String
////Текущее состояние хакатона (статус)
//var status: String = "Start"
////Список спонсоров
//var sponsorArray: Array<String> = arrayOf("Ростех", "Министерство образования", "ООО 'Инвестиции'")
////Бюджет мероприятия
//var budgetInfo: Double = 0.0
////Текущий уровень доступа к интернету
//var internetLevel: Int = 5
////Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
//private var infoTransport: String = ""
////Количество команд
//var countTeam: Int = 0
////Перечень задач
//val tasks: String = "list of Tasks"
////Список доступного оборудования
//var listOfVariableEquipment: String = "50"
////Список доступного оборудования
//var listOfFreeEquipment: String = "50"
////План эвакуации
//val planEv: String = "Plan"
////Текущая температура
//var temperatura: Float = 25.5f
////Политика конфиденциальности
//val nda: String = " описание NDA"
////Доступность медицинской помощи
//var doctorFlag: Boolean = true
////Фидбек участников
//private val feedback: String by lazy {
//    "Понравилось ли мероприятие"
//}
////Настроение
//lateinit var mood: String
////Специальный гость
//lateinit var SuperStar: String
////Подробный план хакатона
//val planWithDetail: String by lazy {
//    "Время начало и этапы хакатона"
//}
//
//
