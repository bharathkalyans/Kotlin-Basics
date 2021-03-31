package telusko

import java.util.*

class Aliens {
    var alienName : String =""

}
fun main(args : Array<String>){
    println(Int.MIN_VALUE)

    var rangeIs = 100.downTo(1)

    for (i in rangeIs step 10) println(i)

    for (i in 1 until 19) print("$i  ")//until will not include last value.


    var map = TreeMap<Int,String>()
    map[1]="Momo Guy"
    map[1010]="Earth Guy"
    for((i,e) in map)
        println("I is :: $i and e is :: $e")

}