import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }

    removeDuplicate(arr, size)
}

fun removeDuplicate(arr: IntArray, size: Int) {
    //write your code here
    val mp = HashMap<Int, Boolean?>()

    for (i in 0 until size) {
        if (mp[arr[i]] == null) {
            print(arr[i].toString() + " ")
        }
        mp[arr[i]] = true
    }
}