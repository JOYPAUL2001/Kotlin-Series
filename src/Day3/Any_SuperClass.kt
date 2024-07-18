package Day3

fun main() {
    var init90009 = Epico("Joydeep", 22)
    println(init90009.toString())
}

class Epico(val name: String, val age: Int) {

    override fun toString(): String {
        return "Age of $name is $age"
    }

}