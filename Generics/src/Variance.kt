open class Person1(val name: String)
class Student1(name: String): Person1(name)
fun main() {
    val names: List<String> = listOf("John", "Sarah", "Mark")
    val ranks: List<Int> = listOf(3, 5, 6)

    val student: Student1 = Student1("John")
    val person: Person1 = student

    val students: MutableList<Student1> = mutableListOf(Student1("Jack"), Student1("Sarah"))
    //val persons: MutableList<Person1> = students
}