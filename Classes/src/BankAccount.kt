import java.util.*

class Account(balance: Int, rate:Float) {
    //write your code here
    var balance: Int
    var rate: Float

    init{
        this.balance = balance
        this.rate = rate
    }

    fun deposit(amt: Int) {
        balance += amt
    }

    fun withdraw(amt: Int) {
        balance -= amt
    }

    fun addInterest(){
        balance = (balance + (balance * rate)).toInt()
    }
}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val balance = read.nextInt()
    val rate = read.nextFloat()

    val account = Account(balance,rate)

    var input = read.nextInt()
    while (input != -1) {
        when(input) {
            1 -> {
                var amt = read.nextInt()
                account.deposit(amt)
            }
            2 -> {
                var amt = read.nextInt()
                account.withdraw(amt)
            }
            3 -> account.addInterest()
        }
        input = read.nextInt()
    }
    print(account.balance)
}