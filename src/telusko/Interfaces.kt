package telusko


interface A{
    fun think()
    fun notThinking(){
        //Implement a function so in future it doesn't crash Classes
        //implementing this Interface.
    }
}

interface B{
    fun swim()
    fun think()
}


class C : A,B{
    override fun think() {
    println("Thinking Nigga")
    }

    override fun swim() {
        println("Swimming Nigga")
    }
}


fun main(args: Array<String>){

}
