// if no modifier or annotation we can get rid of "constructor" keyword
// constructor parameter can have default values
// primary constructor can't contain any code. use init block for initialization.
// there can be multiple init block
// primary constructor can have properties

class Student (firstName: String = "Mark") {
    val firstName: String
    var lastName: String? = null

    init {
        println("init block called")
        this.firstName = firstName
    }

    constructor(firstName: String, lastName: String): this(firstName) {
        println("secondary constructor called")
        this.lastName = lastName
    }
}

fun main() {
    //val student: Student = Student("John")
    val student: Student = Student("John", "Doe")
    println("Name of the student is: ${student.firstName} ${student.lastName}")
}