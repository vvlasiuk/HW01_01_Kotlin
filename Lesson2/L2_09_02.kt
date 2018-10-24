/*Practice Time
when statements in Kotlin are like case or switch statements in other languages.

Create a when statement with three comparisons:

If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it's anything else, print "OK fish name"*/

val fishName = "Fish"
when (fishName.length) {
    0 -> println("Error")
    in 3..12 -> println("Good fish name")
    else -> println("OK fish name")
}


Good fish name