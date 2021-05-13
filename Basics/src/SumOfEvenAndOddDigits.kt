import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var number = read.nextInt()
    var even = 0
    var odd = 0
    while (number > 0) {
        if (((number % 10) % 2) == 0){
            even = even + (number % 10)
        } else {
            odd = odd + number % 10
        }
        number = number / 10
    }
    print("$even $odd")
}