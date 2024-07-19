package Day5

fun main() {

    var v1 = rungta("Joy", 23)
    var v2 = v1.copy(name = "Deep")

    println(v1)
    println(v2)
}

data class rungta(val name: String, val age: Int)