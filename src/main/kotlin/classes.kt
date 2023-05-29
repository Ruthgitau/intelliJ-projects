class Students() {
    var fname: String = ""
    var sname: String = ""
    var age: Int = 0
    var idno: Int = 0
    fun studentsdetails():String {
        return "$fname $sname $age $idno"
    }


    }


fun main(){
    val studentone=Students()
    val studenttwo=Students()
    studentone.fname="Joy"
    studentone.sname="Mark"
    studentone.age=20
    studentone.idno=204586
    println(studentone.studentsdetails())
    studenttwo.fname="tevin"
    studenttwo.sname="lee"
    studenttwo.age=19
    studenttwo.idno=7456745
    println(studenttwo.studentsdetails())






}