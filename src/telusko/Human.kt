package telusko

import java.util.*
import kotlin.random.Random
//This type of Constructors are called Primary Constructors.
abstract class Human (){


    //init is called as soon as the the constructor is done with it's Job.
//    init {
//        println("Human is Created !")
//    }

    abstract fun think()

}


class Alien (name : String): Human(){



    override fun think(){
        println("Thinking like an Alien !")
    }
}


fun main(args : Array<String>){


    var a1 = Alien("Dracker")



}

fun randomID() : String{
    val SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

    var id   = mutableListOf<String>()
    for (i in 0..16){
       var j = Random.nextInt(SET.length)
        id.add(SET[j].toString())
    }

    return id.toString()

}