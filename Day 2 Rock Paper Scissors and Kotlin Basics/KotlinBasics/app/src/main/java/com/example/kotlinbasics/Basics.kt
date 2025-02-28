package com.example.kotlinbasics

fun main() {

    var myAge : Byte = 35
    println(myAge)
    myAge = 36
    println(myAge)
    var pi = 3.14f
    println(pi)
    pi = 4.14159f
    var age: UShort = 35u
    println(age)

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse) // true
    println(myTrue && myFalse) // false
    println(!myTrue) // false

    val myChar = '\u00AE'
    println(myChar)

    var name = "Riyan"
    name = "Martin"
    var firstName = "Riyan"
    var lastName = "Martin"
    println(firstName + " " + lastName)

    // Comparison operators
    // greater than >
    // lower than <
    // greater equal >=
    // lower equal <=
    // equal ==
    print("Please enter your age: ")
    var age1 = 0
    val enterValue = readln()
    age1 = enterValue.toInt()
    if(age1 >= 40){
        // then execute what's in here
        println("You can not go in the club, please go home")
    }else if(age1 >= 18) {
        println("You can enter")
    }else{
        // if not true then execute this in here
        println("You are too young to go into the club")
    }

    var count = 0
    while(count < 3) {
        // so long this content will be executed
        println("Count is $count")
        count++
    }

    var userInput = readln()
    while(userInput == "1") {
        println("While loop executed")
        userInput = readln()
    }
    println("Loop is done")
}
