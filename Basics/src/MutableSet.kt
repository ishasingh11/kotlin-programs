fun main() {
    //Mutable set
    val names = mutableSetOf("John", "Hank", "Dave")
    names.add("Hank")
    println(names)
    names.remove("John")
    println(names)
}