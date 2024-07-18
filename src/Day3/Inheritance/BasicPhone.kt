package Day3.Inheritance

class BasicPhone : Phone() {
    override val name: String = "Nokia 1200"
    override val type: String = "Non Android"

    override fun getDeviceInfo() {
        println("This is a Nokia 1200 Non Android Phone")
    }

    fun getScreenInfo() {}
}