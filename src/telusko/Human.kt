package telusko

class Human constructor(var n: String){

    var name : String = n
    fun think(){
        println("Time to Work Hard!! $name")
    }

}
fun main(args : Array<String>){
    var h1 = Human("Bharath")
    h1.think()


}