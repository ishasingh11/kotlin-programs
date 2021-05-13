//Type Alias
//Need to be declared at top level
//They don't create a new type
//Not only for function type but for any type
typealias intFn = (Int, Int) -> Int

fun printSum(x: Int, y: Int, fn: intFn) {
    val sum = fn(x, y)
    println("Sum of $x and $y is: $sum")
}