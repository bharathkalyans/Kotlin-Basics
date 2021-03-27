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

fun main(args:Array<String>){
    val d1= Decorations("Granite")
    println(d1)
}



















