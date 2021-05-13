fun main() {
    val name: String = "John"

    val f0: (Int, Int) -> Int = {x: Int, y: Int -> x + y}
    //val f0: (Int, Int) -> Int = {x, y -> x + y}
    println(f0(4, 6))

    //minimal lambda expression
    val f1 = {2}
    println(f1())

    val f2 = {x: Int ->
        println(x)
        x * 2
    }
    println(f2(4))

    //it for single parameter
    val f3: (String) -> Int = {x: String -> x.length}
    println(f3.invoke("John"))

    //performOperation1(8, 2, {x, y -> x + y})
    performOperation1(8, 2) {x, y -> x + y}
    //performOperation1({x, y -> x + y})
}

fun performOperation1(x: Int, y: Int, fn: (Int, Int) -> Int) {
    val result = fn(x, y)
    println("Result of $x and $y is: $result")
}