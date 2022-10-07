package ru.netology

fun main() {
    val transferCommissionRate = 0.75f
    var amount = 20000
    var commission = amount * transferCommissionRate / 100

    if ( commission < 35 )  {
        println("Начислена камиссия: 35 Рублей")
    } else {
        println("Начислена камиссия: $commission Рублей")
    }
}