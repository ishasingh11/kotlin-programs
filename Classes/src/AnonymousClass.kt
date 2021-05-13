open class Person3{
    fun walk(){
        println("Person is walking")
    }
    fun sleep(){
        println("Person is sleeping")
    }
    open fun talk(){
        println("Person is talking")
    }
}

fun main() {
    startTalking(object: Person3(){
        override fun talk(){
            println("I am talking")
        }
    })
}

fun startTalking(person: Person3) {
    //code to setup the speaker
    person.talk()
}