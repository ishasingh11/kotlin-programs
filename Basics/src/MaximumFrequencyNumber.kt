import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }

    maxRepeating(arr, size)
}

fun maxRepeating(arr: IntArray, size: Int) {
    //write your code here
    var count = 1
    var tempCount: Int
    var popular: Int = arr.get(0)
    var temp = 0
    for (i in 0 until (size-1)) {
        temp = arr.get(i)
        tempCount = 0
        for (j in 1 until size) {
            if (temp == arr.get(j)) {
                tempCount++
            }
        }
        if (tempCount > count) {
            popular = temp
            count = tempCount
        }
    }
    print(popular)
}