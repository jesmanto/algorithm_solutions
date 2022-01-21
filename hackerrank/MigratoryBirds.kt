fun migratoryBirds(arr: Array<Int>): Int {
    var one = 0
    var two = 0
    var three = 0
    var four = 0
    var five = 0
    val maxBird = mutableListOf<Int>()
    for (i in arr){
        when(i){
            1 -> one++
            2 -> two++
            3 -> three++
            4 -> four++
            5 -> five++
        }
    }

    val intMap = mutableMapOf<Int,Int>(1 to one,2 to two, 3 to three, 4 to four, 5 to five)
    val max = intMap.values.max()
    for (k in intMap.keys){
        if (intMap[k] == max){
            maxBird.add(k)
        }
    }
    maxBird.sort()
    return maxBird.min()!!

}
fun main(){
    val arr = arrayOf(1, 4, 4, 4, 4, 5, 5, 5, 5, 3,3,3,3,4,5,6,7,2,3,4,6,7,8,0,8,7,5,4,2,3,4,2,7,7,7,5,5,5,1,3,2,2)
    println(migratoryBirds(arr))
}