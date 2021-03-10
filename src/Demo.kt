//fun main(args : Array<String>){
//    println("Hello World")
//
//}

open class Shape

class  Rectangle(var height: Double, var length : Double) : Shape() {
    var perimeter = (height+length) * 2

}

fun printHello(name : String,age : Int ): String {
    return "Hello ,Good Morning $name";
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


//    val name :String = "Bharath"
//    var sentence = "My name is ${name.replace("a","r",false)}"
//    println(sentence)
//
//    println(maX(12,23232434))

//    val items = listOf("apple", "banana", "kiwifruit")
//    var i = 0
//    for (item in items) {
//        println(item)
//    }
//
//    val item = listOf("apple", "banana", "kiwifruit")
//    for (index in item.indices) {
//        println("item at $index is ${item[index]}")
//    }

//    var y=90
//    for (x in 0..7){
//        println(x)
//    }
//    for (x in 1..10 step 2) {
//        print(x)
//    }
//    println()
//    for (x in 9 downTo 0 step 3) {
//        print(x)
//    }
//
//   val s =  eliminate(-1212)
//    print(s)


//
//print(good(1.22323232323F))
//
//print(good(1))


    val nameDict = mutableMapOf<String,String>("Bharath" to "Kalyan ","Ananth " to "Reddy")

    for ((k, v) in nameDict) {
        println("$k -> $v")
    }


    var a=12
    var b=23
    a=b.also { b=a }

    print("a :: $a and b :: $b")

}

fun good(obj : Any): Any {

    if (obj is Int)
        return "Its a Integer"
    else
        return "${obj.javaClass}"
}

fun eliminate(a :Int) : Int?{
    if (a >= 0)
        return 1

    return null
    //Null Checks
}

//Using when instead of traditional Switch Statement.
fun describe(obj: Any): String {
    return when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

}

fun sub( a : Int ,b: Int) = a-b

fun maX(a :Int ,b:Int) = if (a>b) a else b

fun sum(a : Int, b: Int, c: Int =2){
    println("Sum is ${a+b+c}")
}
fun nigga(a : Int){
    println("Niggalation Number is $a")
}



















