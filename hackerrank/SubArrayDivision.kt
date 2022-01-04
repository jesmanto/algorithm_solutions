fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var ways = 0
    for (i in 0..(s.size-m)){
        var curr = i
        val newArr = Array(m){s[curr++]}
        if (newArr.sum() == d) ways++
    }
    return ways
}
fun main(){
    val arr = arrayOf(2,2,1,3,2)

    println(birthday(arr,4,2))
    println(birth(arr, 4,2))
}

fun birth(s: Array<Int>,d: Int, m: Int): Int {
    var count = 0
    for (i in 0..(s.size - m)) {
        var curr = i
        val re = Array(m) {s[curr++]} . sum()
        if (re == d) count++
    }
    return count
}