interface Footballer {
    val position: String
    fun dribble()
    fun kick() {
        println("Kick the football")
    }
}

open class Person2(val name: String)

class Student4(name: String, override val position: String): Person2(name), Footballer{
    override fun dribble() {
        println("Dribble the ball")
    }
}

fun main(){
    val student = Student4("John", "Striker")
    playFootball(student)
    printName(student)
}

fun playFootball(footballer: Footballer) {
    footballer.dribble()
    footballer.kick()
}

fun printName(person: Person2) {
    println("Person name is: ${person.name}")
}