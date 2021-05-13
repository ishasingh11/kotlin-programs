fun main() {
    //Map
    val classRanks = mapOf(1 to "Sarah", 2 to "Hank", 3 to "Katherine", 4 to "John")
    println("1. Students: ${classRanks.values}")
    println("2. Ranks: ${classRanks.keys}")
    println("3. Katherine has got a rank ${classRanks.containsValue("Katherine")}")
    println("4. There is a 4th rank ${classRanks.containsKey(4)}")
    println("5. The student at first rank is: ${classRanks.get(1)}")
}