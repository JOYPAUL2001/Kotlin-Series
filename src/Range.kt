fun main(){
    var number = 5


    val result = number in 1..5 //1,2,3,4,5
    println(result)//true


    val result2 = number in 1 until 5 //1,2,3,4
    println(result2)//false
}