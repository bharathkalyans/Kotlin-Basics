package TeluskoTutorials


class Sample

fun main(args:Array<String>){
    println("Hello Suckers!!! ")

    val alien1 = Aliens()
    alien1.alienName = "Zestra"

    println("Name of the ALien is " + alien1.alienName)
    //Or the Normal Way.
    println("Name of the ALien is  ${alien1.alienName}")

}

