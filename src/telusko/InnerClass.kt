package telusko

interface Deed{
    fun think()
}

fun main(){

    var D : Deed = object : Deed {
        override fun think() {
            println("i am in Deed !! ")
        }
    }//Inner Class

/*
    In java it goes like this ::
    Deed d=new Deed(){
            public void think(){
            System.out.println("in deed!!")
            }
                }
    * */

}