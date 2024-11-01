fun solution(N: Int) {
    // write your code in Kotlin 1.3.11 (Linux)
    var num = N
    var binary = ""
    while(num >= 0) {
        num = num/2
        binary = binary + (num % 2).toString()
    }
    println(binary)
}
fun main() {
    solution(1041)
}