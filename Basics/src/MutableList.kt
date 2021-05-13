fun main() {
    //MutableList
    val names = mutableListOf("John", "Hank", "Dave")
    names.add("Sarah")
    println(names)
    names.removeAt(1)
    names.remove("Hank")
    println(names)
    names.set(0, "Katherine")
    names[1] = "Henry"
    println(names)
    names.clear()
    println(names)
}