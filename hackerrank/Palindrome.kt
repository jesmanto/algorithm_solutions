fun isPalindrome(x: Int): Boolean {
    var num = x
    var result : Int
    var sum = 0
    var temp = x
    while(num > 0){
        result = num % 10
        sum = (sum * 10) + result
        num /= 10
    }
    return temp == sum
}