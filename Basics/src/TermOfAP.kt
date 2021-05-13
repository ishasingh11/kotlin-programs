import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var x = read.nextInt()

    printAP(x)
}

fun printAP(num : Int) {
    //write your code here
    var count: Int = 0
    var i: Int = 1
    while(count < num) {
        var nextNum: Int = (3*i) + 2
        i++
        if((nextNum%4) == 0) {

        } else {
            print("$nextNum ")
            count++
        }
    }
}