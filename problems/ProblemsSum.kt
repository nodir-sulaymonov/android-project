package sum

fun sum(array: IntArray): Int{
    var sumArray = 0
    for(number in array){
        sumArray += number
    }
    return sumArray
}
fun main(){
    val myIntList = listOf(3, 4, 2)
	println(myIntList.sum())
}
