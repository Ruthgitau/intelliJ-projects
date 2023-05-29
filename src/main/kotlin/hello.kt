fun main(args:Array<String>){
    //main function is where execution of the program begins
    //functions are used to break down large programs into small chunks
    println("Hello World, ${args[1]}")
    printHello()
    greetings()
    greetings(fname ="Jane")
    drive()
    drive("slow")
    drive(speed="turtle-like")
    tempToday(day="Monday",temp=21)
    println(double(7))
    val result=sumNumber(20,40)
    println(result)
    val getarea=area(4,8)
    println(getarea)
}
fun printHello()
{
    println("hello world")
}
// unit is an empty parameter
// when a parameter is not assigned , one can use a default parameter
fun greetings(fname:String="person"): Unit {
    println("hello "+fname)
}
//User-defined function
fun drive(speed:String="Fast")
{
    println("Driving ${speed}")
}
fun tempToday(day:String, temp:Int)
{
    println("Today is ${day} and the temperature ${temp} degrees celcius")
}
//single expression functions
fun double(x:Int): Int {
    return x * 2
}
//compact expression functions= ignore return the code therefore is
//fun sumNumber(firstno:Int,secondno:Int)=firstno+secondno
//fun that adds two numbers
fun sumNumber(firstno:Int,secondno:Int):Int{
    return(firstno+secondno)
}
//fun that calculates area
fun area(length:Int, width:Int)= (length*width)







