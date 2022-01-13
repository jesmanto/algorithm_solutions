fun main(){
    fun staircase(n: Int): Unit {
        for(i in 0..n){
            print(" ".repeat(n-i))
            println("#".repeat(i))
        }
    }
    staircase(6)
}