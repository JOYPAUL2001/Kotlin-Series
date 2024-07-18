package Day4

/*
In Kotlin, abstract classes are classes that cannot be instantiated directly, but can only be subclassed.
They are used to provide a common interface and implementation for its subclasses.

In simple words, when we don't have any idea what about the function body of the superclass, we define it as abstract so that
child classes can define that according to their need.

//Abstract functions and properties can exist only in abstract class
 */
fun main() {

    var init7012 = Circle(9.0)
    println(init7012.area())
    println(init7012.display())
    println(init7012.name)
}

abstract class SHAPE {
    var name: String = "Joydeep"
    abstract fun area(): Double
    abstract fun display()
}

class Circle(val radius: Double) : SHAPE() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun display() {
        println("This is circle")
    }

}