package Day2

fun main(){

    var arr = arrayOf("Joy", "deep", "Paul")
    var arr1 = arrayOf<Int>(1,3,544)

    for (i in arr1){
        println(i)// here i represents element
    }
    for (i in arr){
        println(i)
    }
    for((i,e) in arr1.withIndex()){
        println("$i - $e")//i stands for index and e stands for element
    }


    println(arr[0])
    println(arr.get(1))
    println(arr.set(0,"Cristiano"))
    for (i in arr){
        println(i)
    }

    println(arr.size)//3
    println(arr.get(3))// it will show error



}