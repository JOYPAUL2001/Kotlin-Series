package Day4

// Abstract class example
abstract class Animal(val name: String) {

    // Concrete method
    fun introduction() {
        println("My name is $name")
    }

    // Abstract method, to be implemented by subclasses
    abstract fun makeSound()
}

// Subclass of Animal, which must implement makeSound()
class Dog(name: String) : Animal(name) {

    override fun makeSound() {
        println("Woof!")
    }
}

// Interface example
interface SHAPESS {

    // Abstract method
    fun area(): Double

    // Default implementation
    fun perimeter(): Double {
        return 0.0
    }
}

// Class that implements Shape interface
class Rectangle(val length: Double, val width: Double) : SHAPESS {

    // Implementation of area() method
    override fun area(): Double {
        return length * width
    }

    // Override of perimeter() method with custom implementation
    override fun perimeter(): Double {
        return 2 * (length + width)
    }
}

fun main() {
    val dog = Dog("Fido")
    dog.introduction() // My name is Fido
    dog.makeSound() // Woof!

    val rectangle = Rectangle(5.0, 3.0)
    println("Area of rectangle is ${rectangle.area()}") // Area of rectangle is 15.0
    println("Perimeter of rectangle is ${rectangle.perimeter()}") // Perimeter of rectangle is 16.0
}