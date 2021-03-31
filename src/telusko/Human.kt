package telusko

import java.util.*
import kotlin.random.Random
//This type of Constructors are called Primary Constructors.
open class Human (var n: String = randomID()){

    private var age: Int = 0
    open var name : String = n
    private var gender : String = "";
    constructor(age : Int, name : String) : this (name){
        this.age = age;
        this.name = name
    }

    constructor(age : Int,name : String, gender : String) : this(name){
        this.age =age
        this.gender = gender
        this.name = name
    }

    //init is called as soon as the the constructor is done with it's Job.
//    init {
//        println("Human is Created !")
//    }

    open fun think(){
        println("Time to Work Hard!! $name as your age is $age and gender is $gender")
    }

}


class Alien (name : String): Human(){

    override var name = name

    override fun think(){
        println("Thinking like an Alien !")
    }
}


fun main(args : Array<String>){

    var h1 = Human(20,"Draco","Male")

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