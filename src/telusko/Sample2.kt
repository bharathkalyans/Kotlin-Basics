package telusko

fun main(){

    var a1 = Aliens();
    a1.alienName = "Gurrr"

    var a2 = Aliens()
    a2.alienName = "Bhurrr"

    var addingName  = a1.plus(a2)
    addingName.alienName // Gives the Concated Name.
}

//Extension Function of Aliens Class.
fun Aliens.plus(a : Aliens) : Aliens{
    val newAlien = Aliens()

    newAlien.alienName = this.alienName + a.alienName

    return newAlien
}