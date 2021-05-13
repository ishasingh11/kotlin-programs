import java.util.*

fun main(args: Array<String>) {
    //write your code here
    var N: Int = Integer.valueOf(readLine())

    if (N in 0..50) {
        var k = 1
        while (k < (N + 1)) {
            for (i in k downTo 1) {
                print(i)
            }
            print("\n")
            k++
        }
    }
}