import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    printStarPattern(n)
}

fun printStarPattern(n: Int) {
    //write your code here
    for(i in 1..n)
    {
        for(j in 1 until (n-i+1))
        {
            print(" ")
        }
        for(k in 1 until (2*i))
        {
            print("*")
        }
        print("\n")
    }
}
