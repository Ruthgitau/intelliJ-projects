//creating lambda functions
fun main() {
    //functions that do not have names..
    val greetings = { println("hello world") }
    greetings()

    var dirtlevel = 30
    val waterfilter = { level: Int -> level / 2 }
    println(waterfilter(dirtlevel))


    fun addtwonumbers(m:Int,n:Int):Int{
        var sum=m+n
        return sum
    }

    val addnumbers = { x:Int, y :Int -> x + y }
    var result = addnumbers(16, 7)
    println(result)



    //using lambdas to create high order functions
    fun highorder(lmbd:(Int,Int) ->Int){
        var results=lmbd(10,20)
        println("The sum of the two numbers is $results")
    }
    highorder(addnumbers)
    highorder(::addtwonumbers)
    fun encode(msg: String,encode:(String) ->String) :String {
        return encode(msg)
    }
        val enc1: (String) -> String = { input -> input.toUpperCase()}
        println(encode("lambda functions", enc1))


}






