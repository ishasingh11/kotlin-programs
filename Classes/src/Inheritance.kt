open class Person (val name: String) {
    init{
        println("This is a person")
    }
    open var age: Int = 1
    open fun doWork() {
        println("Person is doing work")
    }
}

class Student2(name: String, val school: String, override var age: Int) : Person(name) {
    init{
        println("This is a student")
    }
    override fun doWork() {
        println("Student is studying")
        super.doWork()
    }
}

//override function
//override property
//call super
fun main() {
    val student = Student2("John", "DP School", 10)
    student.doWork()
    //val x: Person = Student2("mark", "Doe")
    println("The age of the student is: ${student.age}")
}