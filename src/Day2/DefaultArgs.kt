package Day2

fun main(){

    fun2(3)
    fun2()//Here I didn't pass any argument, that's why by default it will take 2 as an argument.
}

fun fun2(count : Int = 2){
    for (i in 1..count){
        println(i)
    }
}
