package com.example.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    var isPlayerInputRight: Boolean = false
    while(isPlayerInputRight == false) {
        print("Rock, Paper or Scissors? Enter your choice: ")
        playerChoice = readln()
        when(playerChoice.lowercase()) {
            "rock", "paper", "scissors" -> {
                isPlayerInputRight = true
            }else{
                println("Invalid input. Please enter Rock, Paper or Scissors!")
            }
        }
    }


    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner = when {
        playerChoice.lowercase() == computerChoice.lowercase() -> "Tie"
        playerChoice.lowercase() == "Rock" && computerChoice.lowercase() == "Scissors" -> "Player"
        playerChoice.lowercase() == "Paper" && computerChoice.lowercase() == "Rock" -> "Player"
        playerChoice.lowercase() == "Scissors" && computerChoice.lowercase() == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie") {
        println("It's a tie!")
    }else if(winner == "Player") {
        println("Player win")
    }else {
        println("Computer win")
    }
}