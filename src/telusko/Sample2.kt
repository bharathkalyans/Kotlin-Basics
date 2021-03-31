package telusko

import java.math.BigInteger

fun main(args : Array<String>){

    var a1 = Aliens();
    a1.alienName = "Gurrr"

    var a2 = Aliens()
    a2.alienName = "Bhurrr"

    var a3  = a1.plus(a2)
    a3.alienName // Gives the Concated Name.

    var a4 = a1 plus a3 // Add infix keyword before the Function to activate its Infix Property.

    var a5 = a4 + a2
    a5.alienName

    val num = BigInteger.valueOf(70000)
    println(factorial(num,BigInteger.ONE))

}

//Extension Function of Aliens Class , Adding Infix Keyword and Operator For Operator Overloading.
//Also Infix must have only one Parameter.
infix operator fun Aliens.plus(a : Aliens) : Aliens{
    val newAlien = Aliens()

    newAlien.alienName = this.alienName + a.alienName

    return newAlien
}

tailrec fun factorial(num : BigInteger, result : BigInteger) :BigInteger {
     if (num == BigInteger.ZERO){
        return result
     }
     else{
        return factorial(num - BigInteger.ONE, num * result)
     }
}