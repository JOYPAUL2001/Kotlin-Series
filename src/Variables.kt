fun main(){
    var a = 8   // var type variable
    val c = 'a' // val type variable

    a = 9       // var can be reinitialized with same data type

   // c = 'b'     // val can't be reinitialized

    println(c.toInt())
    println(a + c.toInt())
}