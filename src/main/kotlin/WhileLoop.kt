fun main(args:Array<String>) {
    //while loops
var x=5
while (x<=10){
    println(x)
    x++
}
var y=3
do{
    println(y)
    y++
} while (y<=5)

//repeat loop
repeat(3) {
    println("Android")
}
    // lists are ordered collections of elements
    //lists are immutable
val instruments= mutableListOf("trumpet","piano","guitar","drums")
    instruments.remove("piano")
    instruments.add("saxophone")
    instruments[0]="shakers"
println(instruments)
    println(instruments[2])
    println(instruments.size)

//safe call operator
var numberOfbooks : Int?=null

}



