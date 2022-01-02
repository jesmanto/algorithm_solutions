
import java.util.*
import kotlin.math.abs


fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
//    a.sort()
//    val collection = mutableListOf<List<Int>>()
//    val intList = mutableListOf<Int>()
//
//    var numPick = a[0]
//
//    for (num in a.indices){
//        intList.add(a[num])
//        if (abs(num - numPick)>1){
//            intList.remove(a[num])
//            numPick = a[num-1]
//            collection.add(intList.toList())
////            numPick = num
//            intList.clear()
//            intList.add(a[num])
//        }
//    }
//    println(collection.toString())

    val collection = List(101){0}.toMutableList()
    var result = 0

    for (i in a.indices){
        val index = a[i]
        collection[index]++
    }

    for (i in 1 until 100){
        result = Math.max(result,collection[i] + collection[i-1])
    }
    return result


//    val distinct = a.distinct().sorted()
//    var max = 0
//    for ( i in 0..(distinct.size - 2)) {
//        val x= distinct[i]
//        val y = distinct[i+1]
//        val diff = x - y
//        if (diff < 2) {
//            val size = a.filter { it == x || it == y }.size
//            if (size > max) max = size
//        }
//    }
//    return max
}

fun main(){
    val a = arrayOf(1,1,2,2,3,3,4,4,5,5,5)
    println(pickingNumbers(a))
    println(abs(4-5)==1)
}

//@JvmStatic
//fun main(args: Array<String>) {
//    val `in` = Scanner(System.`in`)
//    val n: Int = `in`.nextInt()
//    val frequencies: MutableMap<Int, Int?> = HashMap()
//    for (i in 0 until n) {
//        val num: Int = `in`.nextInt()
//        if (frequencies.containsKey(num)) frequencies[num] = frequencies[num]!! + 1 else frequencies[num] = 1
//    }
//    var maxSet = 0
//    for (i in frequencies.keys) {
//        val left = if (frequencies.containsKey(i - 1)) frequencies[i]!! + frequencies[i - 1]!! else frequencies[i]!!
//        val right = if (frequencies.containsKey(i + 1)) frequencies[i]!! + frequencies[i + 1]!! else frequencies[i]!!
//        if (left > maxSet) maxSet = left
//        if (right > maxSet) maxSet = right
//    }
//    println(maxSet)
//}