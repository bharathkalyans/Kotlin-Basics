package telusko

//This type of Constructors are called Primary Constructors.
class Human (var n: String){

    var name : String = n
    fun think(){
        println("Time to Work Hard!! $name")
    }

}
fun main(args : Array<String>){
    var h1 = Human("Bharath")
    h1.think()


}