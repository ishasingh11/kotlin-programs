import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val s = read.nextInt()
    val e = read.nextInt()
    val w = read.nextInt()

    printCelsius(s, e, w)
}

fun printCelsius(s : Int, e: Int, w: Int) {
    //write your code here
    for (i in s..e step w){
        var celsius = (5*(i-32))/9
        print("\n" + i + "\t" + celsius.toInt())
    }
}