package com.example.kotlinbasics

fun main() {
    val multiplier = 5
    print("Please enter a number: ")
    var inputString = readln()
    try {
        val inputNumber = inputString.toInt()
        val result = inputNumber * multiplier
        println("Result of operation: $result")
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid integer.")
    }
}