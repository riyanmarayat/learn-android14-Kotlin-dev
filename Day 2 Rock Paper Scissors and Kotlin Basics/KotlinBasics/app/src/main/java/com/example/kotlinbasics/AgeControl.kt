package com.example.kotlinbasics

fun main() {
    print("Enter your age as a whole number: ")
    var age = readln().toInt()
    if(age >= 40){
        println("You cannot go into the club, please go home")
    }else if(age in 18..30){
        println("You can enter the club")
    }else{
        println("Age not verified. Please contact support")
    }

}