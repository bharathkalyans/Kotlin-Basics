package aquarium

open class Aquarium (var height: Int, var width: Int, var length: Int) {


    var getVolume:Int
        get() = height * width * length / 1000
        set(value) {height = value * 1000 }

}

class TowerTank(height: Int, width: Int, length: Int) :
    Aquarium(height, width, length){


    }


open class Fish(var Colour : String,var food: String){


   open fun details() = print("My Colour is $Colour and I eat $food !")
}


class Person(fName: String, personAge: Int) {

    private val firstName: String = fName.capitalize()
    var age: Int = personAge

    init {

        println("First Name = $firstName")
        println("Age = $age")
    }
}



abstract class A(){
    abstract val colour:String
}

interface FishEat{
    fun eat()

}
class Shark : A(),FishEat {
    override val colour ="Gray"

    override fun eat() {
        println("I am eating")
    }
}


data class Decorations(var rock : String){

}

fun FishEat.eat(){
}
fun String.hasSpace(){}

fun main(args:Array<String>){
    val d1= Decorations("Granite")
    println(d1)



    val map = mapOf("Bharath" to 1,"Kalyan" to 2,"Reddy " to 2)

    println(map["Bharath"])



   loop@ for (i in 1..100)
        for (j in 1..100){
            print("$j  ")
            if (i> 10) break@loop
        }


}

fun getName(name : String): String{
    return name.reversed()
}




object DickWalesHummer{
     val Name: String = "Dick Wales"

    fun getName() {

    }

}

enum class RGB(val color : Int){
    RED(0xFF0000),
    GREEN(0xfff000)

}



val pairsExample = "Bharath" to "Kalyan"


















