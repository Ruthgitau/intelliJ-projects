//primary constructor
class Student(var fname:String, var age:Int,var idno:Int)
fun main(){
    //create an object of a class
    val st1=Student("Luke",23,4265625)
    val st2=Student("levin",21,89670)
    println("Student name is ${st1.fname} ,age is ${st1.age} and identification number is ${st1.idno}")
    println("Student name is ${st2.fname} ,age is ${st2.age} and identification number is ${st2.idno}")

    val person1=Person("ruth" ,"muthoni" ,19)
    val person2=Person("sheila", "wanjiku", 15)
    println("Person name is ${person1.fname} ${person1.sname} and their age is ${person1.age}")
    println("Person name is ${person2.fname} ${person2.sname} and their age is ${person2.age}")
}
class Person(var fname: String,var sname:String,var age:Int)
