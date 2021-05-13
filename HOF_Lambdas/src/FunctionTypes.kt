fun main() {
    //regular function
    val f1: (Int, Int) -> Int
    val f2: (Int, Int) -> Boolean
    //minimal signature
    val f0: () -> Unit
    //nullable
    val f3: ((String) -> Int)?

    //assignment
    //declared function
    f1 = ::addInt
    //function literals
    //lambda
    f2 = {x: Int, y: Int -> x > y}
    //anonymous function
    f3 = fun(s: String): Int {return s.length}

    //invoke
    f1.invoke(2, 4)
    f2(6, 5)
    f3("Mark")
}

fun addInt(x: Int, y: Int): Int{
    return x + y
}