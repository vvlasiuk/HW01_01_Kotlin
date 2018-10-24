/*Create a main() function that takes an argument representing the time in 24-hour format (values between and including 0 -> 23).

In the main() function, check if the time is before midday (<12), then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".

Notes:
Remember that all main() function arguments are Strings, so you will have to convert this argument to an Int before you can apply the check.

Advanced
Try to use Kotlin's string templates to do this in 1 line.*/



fun main(args: Array<String>) {
    println("${when (args[0].toInt()) {in 0..12 -> "Good Morning Kotlin" else -> "Good Night Kotlin"}}")
}

//Good Morning Kotlin
