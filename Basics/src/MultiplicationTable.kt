import java.util.*

fun main(args: Array<String>) {
    //write your code here
    var integer: Int = Integer.valueOf(readLine())

    for (i in 1..10) {
        val product = integer * i
        println("$product")
    }
}