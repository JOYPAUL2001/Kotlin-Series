package Day2

fun main(){
    var init7658 = c654("Joydeep Paul", 22)
    println(init7658.nam)

    init7658.ag = 23
    init7658.ag = 10
    println(init7658.nam)
}

class c654(name: String, age:Int){

    var nam = name
        get() {
            println("Getter is called")
            return field.toUpperCase()
        }
    var ag = age
        set(value) {
            if(value>18){
                println("Eligible for vote")
                field = value
            }else{
                println("Not eligible for vote!")
            }
        }

}
