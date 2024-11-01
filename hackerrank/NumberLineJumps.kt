fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int):String {
    var isPossible = "NO"
    isPossible = if (((x2 > x1) && (v2 > v1)) || v1 == v2){
        "NO"
    }else if(((x1 + v1) % (x2 + v2) == 0) || (x2 - x1)%(v1-v2) == 0){
        "YES"
    }else{
        "NO"
    }
    return isPossible
}
fun  main(){
    println(kangaroo(43,2,70,2))
    val num : Long = 0
    println(num.toString())
}