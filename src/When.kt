fun main(){
    var name = "Dog"

    when(name){
        "Dog"-> println("You are a Dog")
        "Cat"-> println("You are a Cat")
        "Horse"-> println("You are a horse")
        else-> println("Nothing")
    }

    var number = 13
    var result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "Nothing"
    }
    println(result)
}