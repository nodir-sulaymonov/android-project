package maxindex

fun indexOfMax(a: IntArray): Int? {
   if (a.size == 0) return -1;
    
    var larg = 0;
    
    for (index in a){
        if (a[index] > a [larg]) larg = index;
    }
    return larg;
}

fun main() {
    val myIntList = listOf(3, 4, 2)
	println(indexOfMax(myIntList))
}