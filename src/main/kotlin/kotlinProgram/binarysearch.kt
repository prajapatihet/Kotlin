package kotlinProgram
fun main(){
    var arr = arrayOf(16,18,19,25,40,55)
    var num = 40
    var beg = 0
    var end = arr.size-1
    while (beg<=end){
        var mid = (beg+end)/2
        if (arr[mid]==num){
            println("Element found at $mid")
        }else if (arr[mid]<num){
            beg = mid +1
        }else{
            end = mid-1
        }
    }
}