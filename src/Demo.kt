//fun main(args : Array<String>){
//    println("Hello World")
//
//}

open class Shape

class  Rectangle(var height: Double, var length : Double) : Shape() {
    var perimeter = (height+length) * 2

}

fun main(args: Array<String>) {
//    println(sum(12,23))
//
//    nigga(12)
//    sum(34,34,)
//
//    val age:Int =12
//    val bar :Double = 12.1212
//    var score :Int = 100
//    score =120
//
//    val rectangle = Rectangle(20.0, 32.3)
//    var x = rectangle.perimeter
//    println(x)


    val name :String = "Bharath"
    var sentence = "My name is ${name.replace("a","r",false)}"
    println(sentence)

}


fun sum(a : Int, b: Int, c: Int =2){
    println("Sum is ${a+b+c}")
}
fun nigga(a : Int){
    println("Niggalation Number is $a")
}



















