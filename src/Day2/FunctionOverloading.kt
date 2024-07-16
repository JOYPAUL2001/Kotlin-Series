package Day2

fun main(){
    println(addition(1,3))
    println(addition(2.5,8.9))
    println(addition(7,9.7))
}
fun addition(num1:Int, num2:Int) = num1+num2

fun addition(num1:Double, num2:Double) = num1+num2

fun addition(num1:Int, num2:Double) = num1+num2