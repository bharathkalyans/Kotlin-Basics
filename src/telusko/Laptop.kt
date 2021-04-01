package telusko

data class Laptop (val brand :String , val price : Int){


    fun show(){
        println("Hi, Showing ${brand} laptop")
    }
}

fun main(){

    val lap1 = Laptop("Apple",2000)
    val lap2 = Laptop("Dell",3100)

    var lap3 = lap1.copy("Asus",1212)

    println(lap3)
    println(lap1.equals(lap3))
}