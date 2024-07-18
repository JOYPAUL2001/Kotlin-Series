package Day3.Inheritance

open class Phone {

    init {
        println("Init block of Phone(Parent)")
    }

    open val name: String = ""
    open val type: String = ""
    val volume: Int = 10

    fun makeCall() {}
    fun display() {}
    fun powerOff() {}
    open fun getDeviceInfo() = println("This is a normal phone")
}