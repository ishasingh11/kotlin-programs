class Student1 private constructor (val name: String = "Mark") {
    constructor(firstName: String, lastName: String): this("$firstName $lastName")
}

fun main() {
    //val student = Student1("John")
    val student1 = Student1("John", "Doe")
}