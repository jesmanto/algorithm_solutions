fun main(){
    val creditCard = Triple("1928 3749 0928 3982 4565","456","VISA")
    val account = Pair(creditCard,3_000_000.00)
    val(ccard,balance) = account
    var (cardNumber,_,cardType) = ccard

    println ("The balance of your $cardType account with card number $cardNumber is $$balance")
}