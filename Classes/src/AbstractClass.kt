abstract class Person1(val name: String) {
    abstract fun doWork()
    fun dotalk() {
        //a function to talk
    }
}

class Student3 (name: String, val school: String): Person(name) {
    override fun doWork() {
        println("Student is studying")
    }
}

fun main() {
    val student = Student3("John", "DP School")
    student.doWork()
}