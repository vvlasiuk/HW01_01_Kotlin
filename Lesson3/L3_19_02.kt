/*Why would you want to use the function type notation instead of just the lambda?
Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.*/

import java.util.*

fun main(args: Array<String>) {

    val rollDice4: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice4(4))
}

fun gamePlay(diceRoll: Int){
    println(diceRoll)
}
