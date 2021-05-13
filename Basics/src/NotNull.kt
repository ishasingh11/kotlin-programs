fun main() {
    printNameLength("John","Green")
}

fun printNameLength(firstName: String?, lastName: String?){
    if(firstName!=null){
        //Not Null Assertion Operator !!
        println("Name: ${firstName.length}  ${lastName!!.length}")
    }
}