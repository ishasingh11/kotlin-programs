class Student5(val name: String) {
    inner class SchoolBag() {
        fun printBagOwner() {
            println("This school bag belongs to: $name")
        }
    }
}

fun main() {
    Student5("Mark").SchoolBag().printBagOwner()
}