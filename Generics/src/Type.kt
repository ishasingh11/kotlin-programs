open class Person(val name: String)

class Student(name: String): Person(name)

fun main() {
    //type
    val age: Int = 22
    val rollNumber: Int? = 4

    //subtype
    val student: Student = Student("John")
    val person: Person = student

    //corresponding non nullable type are subtype of nullable type
    val x: String = "John"
    val y: String? = x
}