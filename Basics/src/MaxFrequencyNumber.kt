import java.util.*


fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val size = read.nextInt()
    val arr = IntArray(size){ read.nextInt() }

    maxRepeating1(arr, size)
}

fun maxRepeating1(arr: IntArray, size: Int) {
    //write your code here
    arr.sort()

    var previous: Int = arr.get(0)
    var popular: Int = arr.get(0)
    var count = 1
    var maxCount = 1

    for (i in 1 until size) {
        if (arr.get(i) == previous) {
            count++
        } else {
            if (count > maxCount) {
                popular = arr.get(i - 1)
                maxCount = count
            }
            previous = arr.get(i)
            count = 1
        }
    }

    if (count > maxCount) {
        print(arr.get(size - 1))
    } else {
        print(popular)
    }
}