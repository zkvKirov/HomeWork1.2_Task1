package ru.netology

fun main() {
    val amount = 5_000_00
    val commission = if (amount * 0.75 / 100 < 35_00) 35_00 else amount * 0.75 / 100
    println("Комиссия за операцию = $commission копеек")
}