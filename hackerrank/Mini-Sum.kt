import kotlin.math.abs

fun main(){
    fun miniMaxSum(arr: Array<Int>): Unit {
        val sumArray = mutableListOf<Long>()
        var sum: Long = 0

        for (i in arr) {
            i.toLong()
            sum += ((arr.sum()) - i)
            sumArray.add(sum)
            sum = 0
        }
        sumArray.sort()
        println("${(sumArray[0])} ${(sumArray[4])}")
    }
    val arr = arrayOf(156873294,719583602,581240736,605827319,895647130)
    miniMaxSum(arr)
}