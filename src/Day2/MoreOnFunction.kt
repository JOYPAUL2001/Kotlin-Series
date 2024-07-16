package Day2
import kotlin.math.pow


fun main(){

    var fn:(num1:Double, num2:Double) -> Double = ::addition2
    println(fn(7.0,9.0))

    fn= ::power
    println(fn(6.0,9.4))

}

fun addition2(num1:Double, num2:Double) = num1+num2
fun power(num1: Double,num2: Double) = num1.pow(num2)