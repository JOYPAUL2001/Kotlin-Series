package Day3.Inheritance

class SmartPhone : Phone() {


    override val name: String = "Samsung S9"
    override val type: String = "Android"

    override fun getDeviceInfo() {
        super.getDeviceInfo()//Here we can call the getDeviceInfo function of parent(Phone) class
        println("This is a Samsung S9 Android Phone")
    }

    fun playMovie() {}
    fun takePicture() {}
    fun getLocation() {}


}