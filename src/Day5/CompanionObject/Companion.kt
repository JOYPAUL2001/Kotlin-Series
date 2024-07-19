package Day5.CompanionObject


/*
In Kotlin, the companion object is a special type of object that is associated with a class rather than an instance of the class.
It's similar to static members in other programming languages, but with some added functionality.
 */
fun main(){

    MyClass.A.j8()
    MyClass.B.j9()
    MyClass.j10() ////Since companion object is created, we can directly call the function

    //

}

class MyClass{
    object A{
        fun j8(){
            println("I am J8")
        }
    }
    object B{
        @JvmStatic//this annotation is used to represent that this object method can be treated as static method in java class
        fun j9(){
            println("I am J9")
        }
    }
    // In a class there can be more than 1 object
    // But in a class, there can be maximum 1 companion object

    companion object C{
        @JvmStatic//this annotation is used to represent that this companion method can be treated as static method in java class
        fun j10(){
            println("I am J10")
        }

    }
}