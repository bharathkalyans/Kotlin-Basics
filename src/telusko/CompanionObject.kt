package telusko

class AA{


    companion object{

        @JvmStatic
        fun drink(){
            println("I am drinking Water.")
        }
    }
}

object BB{
    fun pull(){
        println("Pulling")
    }
}

fun main(){
    AA.drink()

    BB.pull()
}