package ru.netology

fun main() {
    val amount = 1_500_00
    val commission = if (amount < 4_666_67) 35_00 else amount * 0.75 / 100
    println("Комиссия за операцию = $commission копеек")
}