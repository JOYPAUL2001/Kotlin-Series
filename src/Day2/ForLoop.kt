package Day2

fun main(){
    println("Using In Keyword")
    for (i in 1..5 step 2){
        println(i)
    }

    println("Using until")
    for(i in 1 until 5){
        println(i)
    }

    println("Using downTo")
    for(i in 10 downTo 1 step 2){
        println(i)
    }


}