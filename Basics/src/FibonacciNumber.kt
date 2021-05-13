import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val n = read.nextInt()

    print(isMember(n))
}

fun isMember(num: Int): Boolean {
    //write you code here
    var firstTerm: Int = 0
    var secondTerm: Int = 1
    var thirdTerm: Int = 0
    while (thirdTerm < num) {
        thirdTerm = firstTerm + secondTerm
        firstTerm = secondTerm
        secondTerm = thirdTerm
    }
    if (thirdTerm == num) {
        return true
    }
    return false
}