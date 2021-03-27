package AndroidDevelopment

import java.util.*;
import kotlin.random.Random


fun main(args : Array<String>){


    for (i in 100 downTo 1 step 5 )
        println(i)

}


fun randomDay():String{
    val days : List<String> = listOf("Monday","Tuesday","Wednesday","Thursday")

    return days[Random.nextInt(4)]
}


fun fishFood(day : String = "fasting") : String{

  return when(day){
        "Monday" ->  "Pellets"
        "Tuesday" -> "Grains"
      else -> "Fasting"
  }

}



