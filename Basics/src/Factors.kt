import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    printFactors(n)
}

fun printFactors(num : Int) {
    //write your code here
    for (i in 2 until num) {
        if ((num % i) == 0) {
            print("$i ")
        }
    }
}