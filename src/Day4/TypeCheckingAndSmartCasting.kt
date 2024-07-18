package Day4

fun main(){

    val circle = Circlez(4.0)
    val player = Playerz("Hari")

    //Type Checking - Checking the type in runtime

    //"is" operator is used for type checking
    if (circle is Circlez){
        println("This is Circle")
    }

    println(circle is Shapezz)        //This will return true because Circle is also a Shape


    //Smart casting
    val arr = arrayOf(circle,player)        //arr is of type Array<Draggable>
    for(obj in arr){
        if (obj is Circlez){                     //Smart casting works here because obj is referencing to Draggable
            println(obj.area())                // but all the properties and methods are of Circle class. So kotlin smart cast obj to Circle in compile time
        }
        else{                                  //Smart casting doesn't work here as the compiler is unable to identify the type
            (obj as Playerz).sayMyName()                      //"as" operator is used for casting
        }
    }

}
interface Draggables {
    fun drag()
}

abstract class Shapezz : Draggables {
    abstract fun area() : Double
}

class Circlez(val radius : Double) : Shapezz() {
    override fun drag() {
        println("Circle is dragging")
    }


    override fun area(): Double {
        return Math.PI*radius*radius
    }
}

class Playerz(val name : String) : Draggables{
    override fun drag() {
        println("$name is dragging" )
    }
    fun sayMyName() = println("My name is - $name ")
}