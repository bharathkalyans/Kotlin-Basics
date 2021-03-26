package AndroidDevelopment

import java.util.*;
import kotlin.random.Random


fun main(args : Array<String>){

    val name:String = "Bharath"
    val p = print(name)

    println(p)

    val temp =20
    val message = "Is Hot ${temp > 23} "
    print(randomDay())

}


fun randomDay():String{
    val days : List<String> = listOf("Monday","Tuesday","Wednesday","Thursday")

    return days[Random.nextInt(4)]
}



