/*Extended Task
In the body of the dayOfWeek() function, answer the question by printing the current day of the week.*/

import java.util.*

fun main(args: Array<String>) {
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "ERROR"
    })
    }


//Hello, world!
//What day is it today?
//Tuesday