package Day5

/*
Sealed Class -

- A sealed class is a class that can only be subclassed within the same file where it’s declared
- Subclasses must be declared within the same file as the sealed class
- Sealed classes are often used to represent a closed set of classes, such as when defining the different states of a state machine
- Sealed classes are similar to enum classes, but provide more flexibility
- Enum classes represent a fixed set of values, whereas sealed classes can represent a fixed set of classes with additional data and behavior
- To create a sealed class, use the “sealed” keyword before the class declaration
- Sealed classes can have subclasses declared as normal classes within the same file

Sealed class is Abstract class
 */
fun main(){

    val init101: Tile  = A("Joydeep",87)
    //var init202 = B("Paul",65)
    //println("${init101.name}"+" ${init202.name}")


    //special cases
    val points = when(init101){
        is A -> init101.age+1
        is B -> init101.age+2
    }

    println(points)

}

sealed class Tile()
class A(val name: String, val age: Int): Tile()
class B(val name: String, val age: Int): Tile()
