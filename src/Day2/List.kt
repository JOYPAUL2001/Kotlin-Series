package Day2

fun main() {

    //Immutable - can't change it after initialization
    val list1 = listOf("Pen", "Book", "Pencil", "Bag")


    //Mutable... we can modify
    val list2 = mutableListOf("Pen", "Book", "Pencil", "Bag")
    list2.add("Scissor")
    list2.add(2, "Eraser")
    list2.removeAt(2)
    list2.removeLast()
    println(list2)

    //get methods
    println(list2.get(2))
    println(list1[2])

    //set method
    list2.set(2, "AMD")//Pencil has been replaced by AMD
    println(list2)

    //Modifying
    list2[2] = "AMD ryzen 4050HX"
    println(list2)


    //checking a specified string is present in list or not
    println(list2.contains("Pen"))
    println(list2.contains("Eraser"))


    //print Elements with index
    for((i,e) in list2.withIndex()){
        println("$i -> $e")
    }

}