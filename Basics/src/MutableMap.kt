fun main() {
    //Mutable map
    val classRanks = mutableMapOf(1 to "Sarah", 2 to "Hank", 3 to "Katherine", 4 to "John")
    classRanks.put(4, "Dave")
    classRanks.remove(2)
    println(classRanks)
}