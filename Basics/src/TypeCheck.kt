fun main() {
    //Type checking
    val name: Any = "John"
    if(name is String){
        println(name.length)
    }
}