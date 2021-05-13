import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }

    println(getDouble(arr,size))
}

fun getDouble(arr: IntArray, size: Int): Int {
    //write your code here
    var v = 1
    for (i in 0 until arr.size) {
        for (j in (i+1) until arr.size) {
            if (arr[i] == arr[j]) {
                if (v==1 && arr[j]!=0) {
                    return arr[i]
                }
                arr[j]=0
                v++
            }
        }
        v=1
    }
    return 0
}