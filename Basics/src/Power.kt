import java.util.*

fun main(args: Array<String>) {
    //write your code here
    val (x, n) = readLine()!!.split(' ').map(String::toInt)
//    var x: Int = Integer.valueOf(readLine())
//    var n: Int = Integer.valueOf(readLine())

    if ((x in 1..8) && (n in 0..9)){
        val result = Math.pow(x.toDouble(), n.toDouble())
        println(result.toInt())
    }
}