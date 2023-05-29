//a class is a blueprint for creating objects
//objects are instances of a class
//class names cannot be keywords

class House {
    //properties and functions
    var color: String = " "
    var numberOfWindows: Int = 0
    var numberOfDoors: Int = 0
    //function

    fun houseDetails(): String {
        return "$color $numberOfDoors $numberOfWindows"
    }
}
fun main() {
    val myHouse=House()
    val JaneHouse=House()
    //assigning properties ofa class and assigning values
    myHouse.color="red"
    myHouse.numberOfDoors=4
    myHouse.numberOfWindows=7
    println(myHouse.color)
    println(myHouse.numberOfDoors)
    println(myHouse.numberOfWindows)
    println(myHouse.houseDetails())
    JaneHouse.color="blue"
    JaneHouse.numberOfDoors=9
    JaneHouse.numberOfWindows=12
    println(JaneHouse.color)
    println(JaneHouse.numberOfDoors)
    println(JaneHouse.numberOfWindows)
    println(JaneHouse.houseDetails())
}












