//crossinline can be declared only for parameters of inline function
inline fun printString(crossinline fn: (String) -> Unit): Unit {
    fn("John")
    println("Data printed")

    //region
    val task = object: Runnable {
        override fun run() = fn("Mark")
    }
    task.run()
    //end region
}

fun main() {
    printString{println(it)}
}