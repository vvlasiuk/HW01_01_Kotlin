/*Practice Time
You can do the following filter exercise in REPL.

Create a list of spices, as follows:
val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
Create a filter that gets all the curries and sorts them by string length.
Hint: After you type the dot (.), IntelliJ will give you a list of functions you can apply.
Filter the list of spices to return all the spices that start with 'c' and end in 'e'. Do it in two different ways.
Take the first three elements of the list and return the ones that start with 'c'.
Note: We will be able to do a lot more interesting stuff with filters after you learn about classes and Map.
*/

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    println(spices.filter { it.contains("curry") }.sortedBy { it.length })

    println(spices.filter{it.startsWith('c')}.filter{it.endsWith('e')})
}

//[curry, red curry, green curry]
//[cayenne]