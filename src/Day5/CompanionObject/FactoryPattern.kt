package Day5.CompanionObject

fun main() {
    A.create().show()//directly accessing the methods of class A with the help of companion object
}

class A {
    companion object {
        fun create(): A = A()// Creating object of class A in class A itself
    }

    fun show() {
        println("You are dancing!")
    }
}

//This represents the factory pattern