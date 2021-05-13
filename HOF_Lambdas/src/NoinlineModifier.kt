//inline lambda/anonymous function parameters can't be stored in a variable, passed to another function
inline fun printName(name: String, fn: (String) -> Unit, noinline fn1:(Int, Int) -> Unit) {
    fn(name)
    printSum1(fn1)
}

fun printSum1(fn: (Int, Int) -> Unit) {
    fn(4, 7)
}

fun main() {
    val name: String = "john"
    printName(name, {println(it)}) {x: Int, y: Int -> println("The sum of number is ${x + y}")}
}