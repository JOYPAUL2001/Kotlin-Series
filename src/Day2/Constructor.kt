package Day2

fun main(){

    var init2 = c1("Joydeep",21)
    println(init2.nam)
    println(init2.ag)
}

class c1(name: String, age: Int){//here name and age are just parameters
    var nam = name
    var ag = age// here nam and ag are the properties of class c1
}