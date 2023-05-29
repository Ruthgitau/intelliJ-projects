fun main(args:Array<String>){
    var jane1st=(1..30).toList()
    var studentsnames= listOf("james","jane","mark")
    studentsnames=studentsnames.filter { it[0]=='j'}
    //lazy filtered lists
    var instruments = listOf("viola","cello","violin")
    var filtered= instruments.asSequence().filter { it[0]=='v' }
    var newlist=(filtered).toList()
    println("filtered"+ filtered)
    println(newlist)
//eager filtered listd
    val eager = instruments.filter { it[0]=='v' }
    println("eager"+ eager)

    //maps lists
    val numbers= setOf(1,2,3)
    println(numbers.map {it *3})

    //flatten lists
    val numbersets= listOf(setOf(1,2,3), setOf(4,5), setOf(1,2))
    println(numbersets.flatten())



}
