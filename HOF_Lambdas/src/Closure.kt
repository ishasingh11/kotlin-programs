//useful in callbacks
fun printNext(): () -> Unit {
    var counter = 8
    return { counter++
    println("The counter is $counter")
    }
}

fun main() {
    val fn = printNext()
    fn()
    fn()
}