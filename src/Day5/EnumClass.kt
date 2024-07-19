package Day5

/*
Enum classes

Enum classes are a convenient way to represent a concrete set of possible values.
Enum constants are instances of an Enum class, the constants can be initialized by passing specific values to the constructor.
 */

fun main(){
    //Enum class usage
    var day = Days.SUNDAY
    println(day)
    println(day.number)
    //Loop

    for (i in Days.values()){
        println(i)
    }

    for (i in Days.values().take(Days.values().size - 3)){      //from 0 till n-3
        day = i
    }

    day.printFormattedDays()
}

enum class Days(val number : Int){
    MONDAY(1),                 //These are objects of Days
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printFormattedDays(){
        println("Day is $this")// this keyword will point the current object
    }
}