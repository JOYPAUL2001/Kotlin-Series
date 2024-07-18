package Day3

fun main() {
    val shape1: Shape = Circle()
    val shape2: Shape = Square()

    shape1.draw() // "Drawing a circle." (The draw method from Circle class is called)
    shape2.draw() // "Drawing a square." (The draw method from Square class is called)
}
open class Shape {
    open fun draw() {
        println("Drawing shape.")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle.")
    }
}

class Square : Shape() {
    override fun draw() {
        println("Drawing a square.")
    }
}

/*
In the above example, the Shape class is a superclass that is inherited by Circle and Square subclasses.
The draw() method is overridden in both subclasses.
When calling draw() on objects of type Shape, the actual implementation to be executed is determined at runtime based on the object's actual type,
which demonstrates dynamic polymorphism.
 */
