package telusko

import java.util.*

fun main(){

    println("Enter your Name :: ")
    val name = readLine()

    val scanner : Scanner = Scanner(System.`in`)

    println("Enter your Age :: ")
    val age : Int?  = scanner.nextInt()

    println("Enter your Gender :: ")
    val gender : String? = readLine()

    println("Hi, $name as your age is $age! and gender is $gender we will save you.")


}