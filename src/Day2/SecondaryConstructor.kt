package Day2

fun main(){

    var f45 = Bus("SadgGuru", 700)
    var f55 = Bus("Ma TaraMa", 600)
    var f65 = Bus("Ma Khateja", 55, 200, 780)

    println("${f45.name} has ${f45.seat} seats and has ${f45.power} powered engine runs ${f45.KM} Km")
    println("${f65.name} has ${f65.seat} seats and has ${f65.power} powered engine runs ${f65.KM} Km")
}
class Bus(val name: String, val seat: Int, val power: Int, val KM: Int){
    constructor(Bname: String, BKM: Int):
            this(Bname,40, 150, BKM)
}