fun main() {
    //Default arguments
    printUsername1("John","Green")
    printUsername1("John")
}

fun printUsername1(firstName: String, lastName: String = "Cena"){
    println("The name is: $firstName $lastName")
}