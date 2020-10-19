fun runs(a: IntArray): Int {
    var first = 0;
    if(a.size == first){
        return first
    }
    var second = a[first]
    for (index in a) {
        index != second
        first++
        second = index
    }
    return ++first
}
fun main(){
    val myIntList = listOf(3, 4, 2)
	println(runs(myIntList))
}