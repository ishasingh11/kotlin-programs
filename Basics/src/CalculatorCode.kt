import java.util.*

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var input1  = read.nextDouble()
    var input2  = read.nextDouble()
    var operator= read.next()
    val intResult = calculate(input1, input2, operator)

    //write your code here
    var choice: String = read.next()
    when (choice) {
        "n" -> print(intResult)
        "y" -> {
            val op2: String = read.next()
            var input: Double = read.nextDouble()
            print(calculate(intResult, input, op2))
        }
    }

}

fun calculate(input1:Double,input2:Double,operator:String): Double{
    //write your code here
    val intResult: Double = when (operator) {
        "+" -> input1 + input2
        "-" -> input1 - input2
        "*" -> input1 * input2
        "/" -> input1 / input2
        else -> 0.0
    }
    return intResult
    return 0.0
}