/*Practice Time: Lambdas
Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
Create a new variable, rollDice2, for this same lambda using the function type notation.*/

import java.util.*

fun main(args: Array<String>) {
    val rollDice1 = {Random().nextInt(12) + 1}

    println(rollDice1())

    val rollDice2 = { sides: Int ->
        Random().nextInt(sides) + 1
    }

    println(rollDice2(25))

    val rollDice3 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    println(rollDice3(0))

    val rollDice4: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    println(rollDice4(75))
}