fun main(){
    var a = 12
    var b = 5


    // Arithmetic operator
    println(a+b)// 17
    println(a-b)// 7
    println(a*b)// 60
    println(a/b)// 2
    println(a%b)// 2
    println(a.toFloat()/b)// 2.4


    //Relational Operator
    println(a>b)// true
    println(a<b)// false
    println(a>=b)// true
    println(a<=b)// false
    println(a!=b)// true
    println(a==b)// false


    //pre increment and post increment
    var k = 9

        //pre increment
        ++k
    println(k)

        //post increment
        k++
    println(k)
    var l = 10
    println(l++ + ++l)//10+12==22


    //Logical operator
    var g = true
    var h = false
    println(g && h)
    println(g || h)
    println(!g)

}