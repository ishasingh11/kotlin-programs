import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }
    val x = read.nextInt()

    printPairsWithSum(arr, size, x)
}

fun printPairsWithSum(arr: IntArray, size: Int, x: Int) {
    //write your code here
    for (i in 0 until size) {
        for (j in i + 1 until size) {
            if (arr[i] + arr[j] == x){
                if(arr[i] < arr[j]) {
                    print("${arr[i]} ${arr[j]}")
                } else {
                    print("${arr[j]} ${arr[i]}")
                }
                print("\n")
            }
        }
    }
}