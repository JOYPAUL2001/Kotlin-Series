package Day2

fun main(){

    println(add(10,2))
    println(sub(10,2))
    evenOrOdd(10)
    evenOrOdd(9)
}

fun add(num1:Int, num2:Int) = num1+num2

fun sub(num1: Int, num2: Int) : Int{
    return num1-num2
}

fun evenOrOdd(num:Int){
    if(num%2==0){
        println("Even")
    }
    else{
        println("Odd")
    }
}