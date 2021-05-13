fun getSum(x: Int, y: Int): Int {
    return x + y
}

//higher order function
fun performOperation(x: Int, y: Int, fn: (Int, Int) -> Int) {
    val result = fn(x, y)
    println("Result of $x and $y is: $result")
}

//returns a function
fun getLength(): (String) -> Int {
    return {x: String -> x.length}
}
fun main() {
    //pass function as parameter
    performOperation(2, 4, ::getSum)

    performOperation(8, 1, {x, y -> x - y})

    performOperation(7, 6, fun(x: Int, y: Int): Int = x + y)

    val f: (String) -> Int = getLength()
    println("Length is: ${f("Mark")}")
}