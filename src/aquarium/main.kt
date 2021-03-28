package aquarium

fun main(args : Array<String>){


    var name = "bHARATH"
   var changedName=  changeName(name)

    print(changedName)


}

class JavaRun {

}

fun changeName( name : String):  String{
   return  name.capitalize()
}


fun buildAquarium(){
    val myAquarium = Aquarium(12,20,33)
    println ("${myAquarium.height} is my Height")

    var  smallAquarium = Aquarium(20,40,50)

    println(smallAquarium.getVolume)

val S = Shark()
    S.eat()

}