package TeluskoTutorials

import java.util.Scanner;


class Sample

fun main(args:Array<String>){
    println("Hello Suckers!!! ")

    val alien1 = Aliens()
    alien1.alienName = "Zestra"

    println("Name of the ALien is " + alien1.alienName)
    //Or the Normal Way.
    println("Name of the ALien is  ${alien1.alienName}")


    val name: String? = readLine();
    val age: Int = Integer.valueOf(readLine())
    val scanner  = Scanner(System.`in`)




    //Calling java Class
    //Working on Java and Kotlin InterOperability
    val alien2 : AliensJavaClass = AliensJavaClass()
    alien2.alienName = "Darkseid"
    println("Alien name is :: ${alien2.alienName}")


}
