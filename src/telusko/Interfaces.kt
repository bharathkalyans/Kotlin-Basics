package telusko


interface A{
    fun think()
    fun notThinking(){
        //Implement a function so in future it doesn't crash Classes
        //implementing this Interface.
    }
    fun abc(){
        println("In A ")

    }
}

interface B{
    fun swim()
    fun think()
    fun abc(){
        println("In B ")

    }
}


class C : A,B{
    override fun think() {
    println("Thinking Nigga")
    }

    override fun abc() {
        println("In C ")
        super<A>.abc()
    }

    override fun swim() {
        println("Swimming Nigga")
    }
}


fun main(args: Array<String>){

    var obj =  C()
    obj.abc()
}
