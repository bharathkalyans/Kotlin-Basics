@file:JvmName("SampleTest")//This will calling Kotlin File name to whatever you want!
package TeluskoTutorials

import TeluskoTutorials.TestRunner.printName



class Sample

fun main(args:Array<String>){
    println("Hello Suckers!!! ")

    val alien1 = Aliens()
    alien1.alienName = "Zestra"

    println("Name of the ALien is " + alien1.alienName)
    //Or the Normal Way.
    println("Name of the ALien is  ${alien1.alienName}")

//    println("Enter a Name ::")
//    val name: String? = readLine()
//    val age: Int = Integer.valueOf(readLine())
//    val scanner  = Scanner(System.`in`)


    //Calling java Class
    //Working on Java and Kotlin InterOperability
    val alien2 : AliensJavaClass = AliensJavaClass()
    alien2.alienName = "Darkseid"
    println("Alien name is :: ${alien2.alienName}")



    println(add(2,2.11212121f))

    println("Result is ${add(100 )}")

    val myName = printName("Bharath")





}

fun add(a : Int,b : Float): Float =  a.plus(b)


fun add(a : Int ,b : Int =10): Int = a+b











