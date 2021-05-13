import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }

    pushZerosToEnd(arr, size)
    arr.forEach { print("$it ") }
}

fun pushZerosToEnd(arr: IntArray, size: Int) {
    //write your code here
    var count = 0
    for (i in 0 until size) {
        if (arr[i] !== 0) {
            arr[count++] = arr[i]
        }
    }
    while (count < size) {
        arr[count++] = 0
    }
}