fun plusMinus(arr: Array<Int>): Unit {
    val negatives = arr.count { it < 0 }
    val zeros = arr.count { it == 0 }
    val positives = arr.count { it > 0}
    val arr_len = arr.size.toDouble()
    println("%.6f".format(positives.div(arr_len)))
    println("%.6f".format(negatives.div(arr_len)))
    println("%.6f".format(zeros.div(arr_len)))
}

fun binSearch(ar : Array<Int>, num : Int) : Int{
    ar.sort()
    ar.slice(0..ar.indexOf(num))
    return ar.indexOf(num)
}
fun main(){
    val ar = arrayOf(4,5,6,7,3,5,6,7,8,5)
    val num = 6
    ar.sort()
    val arSlice = ar.slice(ar.indexOf(num)..ar.lastIndexOf(num))

    print(arSlice.toString())

}