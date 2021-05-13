fun main(){
    //Null Safety
    var name: String = "John"
    println(name.length)

    var name1: String? = null
    //Safe Call Operator ?.
    println(name1?.length)
    //Elvis Operator ?:
    println(name1?.length ?: 0)
}