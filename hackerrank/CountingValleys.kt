fun countingValleys(n: Int, s: String): Int {

    var preCount = 0
    var count = 0
    var valley = 0

    val charArray = s.toCharArray()
    for(i in s.indices){
        if(charArray[i]=='U'){
            count++
        }else if(charArray[i]=='D'){
            count--
        }

        if(count==0 && preCount<count){
            valley++
        }

        preCount = count
    }

    return valley;
}
fun main(){
    println(countingValleys(8,"DDUUDDUDUUUD"))
}