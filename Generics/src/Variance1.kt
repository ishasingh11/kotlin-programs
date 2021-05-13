package generic

//why invariant?
open class Person2(val name: String)
class Student2(name: String): Person2(name)
class Teacher(name: String): Person2(name)

fun add(group: MutableList<Person2>, person: Person2) = group.add(person)

fun main() {
    val students: MutableList<Student2> = mutableListOf()
    val teacher: Teacher = Teacher("John")
    //add(students, teacher)

    val student: Student2 = students.get(0)
}