import java.util.Arrays
fun main(args:Array<String>) {
    //using when in place of if else
    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesdat")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        else -> println("Invalid Day")
    }
    //arrays usingArrayOf
    //arrays are immutable ie cannot be changed
    val students = arrayOf("Jane", "Joyce", "Mark", "david")
    println(Arrays.toString(students))

    val combined = arrayOf("Three", 5, 26, "sixteen")
    println(Arrays.toString(combined))
// assessing an array
    val numbers = arrayOf(9, 5, 26, 7)
    println((numbers[1]))

    //for loops
    //used to look through arrays
    for (x in students)
        println(x)
    for (intergers in numbers)
        println(intergers)
//for loops within a range
    for (i in 1..10)
        println(i)
//for loops that print reverse
for (i in 5 downTo 1)
    println(i)
//for loops when skipping some characters
for (x in 'a'..'z' step 3)
    println(x)


}