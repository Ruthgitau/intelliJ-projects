fun main (args:Array<String>){
    //creating a variable
var age =70
var fname= "jane"
var lname= "Joy"
//printing a variable
    //string intercolation using curly brackets and dollar sign
println("I am $age years old")
println("Hello $fname $lname")
//suming numbers
var fno= 100
var sno= 20
    var total :Int = fno+sno
println("the sum of the numbers is $total")
    //displaying the length of a string
    //string concanetion, using the plus sign
var cname= "jennifer"
    println("$cname length is ${cname.length}")
    println("This is in Uppercase ${cname.uppercase()}")
    println("This is in Lowercase "+ cname.lowercase())
    println("In $cname the index of e is ${cname.indexOf("e")}")
    println("In $cname the index of f is ${cname.indexOf("f")}")

    var ano= 10
    var bno= 23

    println("the sum of the two numbers is ${ano+bno}")

    if(age >35) {
        println("Person is not a youth")
    }
    else if (age>18){
        println("Person is a youth")
    }
    else if(age < 18){println("person is a child ")}

    else{ println("Person is not relevant")}
    var temperature =36
    if(temperature in 1..50){
        println("person is not sick")
    }



}


