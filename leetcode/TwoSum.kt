
fun twoSum(nums: IntArray, target: Int): IntArray {
//    var first = 0
//    var second = 1
//    val newArr = intArrayOf(0,2)
//    for(i in nums.indices) {
//        first = i
//        for (j in nums.indices){
//            if (j == i){
//                continue
//            }else{
//                second = j
//            }
//            if (nums[first] + nums[second] == target){
//                newArr[0] = first
//                newArr[1] = second
//            }
//        }
//
//    }
//
//    return newArr
    val output = mutableListOf<Int>()
    for(i in 0..nums.size - 2){
        if (nums[i]+nums[i+1] == target){
            output.add(i)
            output.add(i+1)
        }
    }

    return output.toIntArray()
}

fun main(){
    val arr = intArrayOf(2,15,2,7)
    val target = 9
    println(twoSum(arr, target).contentToString())
}