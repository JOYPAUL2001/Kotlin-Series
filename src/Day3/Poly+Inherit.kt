package Day3

fun main() {
    val shape1: Shapes = Circles()
    val shape2: Shapes = Squares()

    print(shape1)
}
fun print(shapes : Shapes){
    println(shapes.draw())
}
open class Shapes {
    open fun draw() {
        println("Drawing shape.")
    }
}

class Circles : Shapes() {
    override fun draw() {
        println("Drawing a circle.")
    }
}

class Squares : Shapes() {
    override fun draw() {
        println("Drawing a square.")
    }
}

