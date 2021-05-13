//data class
//only properties in constructor
data class Student6(val name: String, var section: String) {
    var age: Int = 8
}

fun main() {
    val student = Student6("John", "A")
    student.age = 10
    val student1 = Student6("John","A")

    //equals
    println("Line1: equals() function: ${student1.equals(student)}")

    //toString
    println("Line2: toString() function: ${student1.toString()}")

    //copy
    val student2 = student.copy("Mark")
    println("Line3: copy() function: ${student2.toString()}")

    //destructuring
    val(name, section) = student
    println("Line4: destructuring: $name is in section $section")
}