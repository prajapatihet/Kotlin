package kotlinProgram

fun foo(): String {
    println("Calculating kotlinProgram.foo...")
    return "kotlinProgram.foo"
}
fun main(){
    println("First ${foo()}, Second ${foo()}")
    //
    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")
    println(mutableList)
    // it is not work because it is in read only mode
   // val readOnlyList = listOf("Java")
   // readOnlyList.add("Kotlin")
}