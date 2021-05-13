fun main() {
    //Type casting
    val name: Any = "John"
    val name1: String = name as String
    println(name1)

    val x: Int = 7
    //val y: Long = x as Long //error

    val z: Long? = x as? Long
    println(z)
}