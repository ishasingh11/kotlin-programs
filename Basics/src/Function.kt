fun main() {
    //declaration
    println(addNumbers(4,5))
    printUsername("John")
    println(xorsum(2,3))
}

fun addNumbers(x: Int, y: Int) : Int{
    return x + y
}

fun printUsername(name: String){
    println(name)
}

fun xorsum(a: Int,b: Int)= a.xor(b)