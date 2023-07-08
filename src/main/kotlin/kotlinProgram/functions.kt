package kotlinProgram

fun main(){
    var max = max(4,6)
    var max1 = max1(9,2)
    println(max)
    println(max1)
}
fun max(a: Int, b: Int): Int{
    return if(a>b) a else b
}
fun max1(a: Int,b: Int) = if(a>b) a else b