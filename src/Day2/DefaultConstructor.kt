package Day2

fun main(){
    var bhc = c23()
    println(bhc.f67(6,8))
    println(bhc.f68(3,9))
}
class c23{
    fun f67(a:Int, b:Int): Int{
        return a+b
    }
    fun f68(a:Int, b: Int): Int{
        return a*b
    }
}