package Day4

interface FirstInterface {
    fun add(a: Int, b: Int = 5)
    fun print()
    {
        println("This is a default method defined in the interface")
    }
    fun dance()
    val name:String
    val age: Int
        get() = 22
}
class InterfaceDemo : FirstInterface {
    override fun add(a: Int, b: Int)
    {
        val x = a + b
        println("Sum is $x")
    }

    override fun print()
    {
        super.print()
        println("It has been overridden")
    }

    override fun dance() {
        println("Lets dance!")
    }

    override val name: String
        get() = "Joydeep"
    override val age: Int
        get() = 32

}

fun main()
{
    val obj = InterfaceDemo()
    println(obj.add(5))
    obj.print()
    obj.dance()
    println(obj.name)
    println(obj.age)
}