/*Practice Time
Looping over arrays and lists is a fundamental technique that has a lot of flexibility in Kotlin. Let's practice.

Basic example
Create an integer array of numbers called numbers, from 11 to 15.
Create an empty mutable list for Strings.
Write a for loop that loops over the array and adds the string representation of each number to the list.
Challenge example
How can you use a for loop to create (a list of) the numbers between 1 and 100 that are divisible by 7?*/

var list : MutableList<Int> = mutableListOf()
for (i in 0..100 step 7) list.add(i) 
print(list)

[0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]