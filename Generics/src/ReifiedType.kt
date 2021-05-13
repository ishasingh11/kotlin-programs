inline fun <reified T> checkTypeAtRuntime(item: Any) {
    println("${item is T}")
}

fun main() {
    val names: MutableList<String> = mutableListOf("John", "Sarah", "Mark")
    val ages: MutableList<Int> = mutableListOf(1,2,3)

    checkTypeAtRuntime<String>("John")
    //println("${"John" is String}")
    checkTypeAtRuntime<Int>("Sarah")
    //println("${"Sarah" is Int}")
}