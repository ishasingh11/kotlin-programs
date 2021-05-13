fun main() {
    //String template
    val flatNumber: Int = 25
    val address: String = "Tower 2, Flat No." + flatNumber
    println(address)

    val flatNumber1: Int = 23
    val address1: String = "Tower 2, Flat No. $flatNumber1"
    println(address1)

    val name: String = "John Green"
    println("name is ${name.length} characters long")
}