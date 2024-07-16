package Day2

fun main(){

    var inst1 = Car("Ferrai","Down", 500)

    println(inst1.f4())
    println(inst1.f5())
    println(inst1.name1+" "+inst1.name)
}
class Car(val name: String, val position: String, val KM: Int){
    var name1 = name
    fun f4(){
        println("$name1 is my car")
    }
    var pos = position
    fun f5(){
        println("$pos is my car's position")
    }
    // Here name, position, KM, name1, pos are the properties of class Car
}