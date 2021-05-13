fun main(args: Array<String>){
    val mySet: Set<Any> = setOf(2,6,4,29,18,4,5)
    val remainList= mySet.drop(29)
    for(element in remainList){
        print("$element, ")
    }
}