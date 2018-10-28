/*Practice Time
Let's improve our SimpleSpice class so that we can have various spices with different levels of spiciness.

Create a new class, Spice.
Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
Add an init block that prints out the values for the object after it has been created. Create a spice.
Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
Because salt is a very common spice, create a helper function called makeSalt().*/

fun main(args: Array<String>) {
    val spices1 = listOf(
            Spice("curry", "mild"),
            Spice("pepper", "medium"),
            Spice("cayenne", "spicy"),
            Spice("ginger", "mild"),
            Spice("red curry", "medium"),
            Spice("green curry", "mild"),
            Spice("hot pepper", "extremely spicy"))

    val spice = Spice("cayenne", "spicy")

    val spicelist = spices1.filter {it.heat < 5}

}

fun makeSalt() = Spice("Salt")

class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
      }
    init {
        println("name=$name, spiciness=$spiciness")}
}


/*
name=curry, spiciness=mild
name=pepper, spiciness=medium
name=cayenne, spiciness=spicy
name=ginger, spiciness=mild
name=red curry, spiciness=medium
name=green curry, spiciness=mild
name=hot pepper, spiciness=extremely spicy
name=cayenne, spiciness=spicy
*/