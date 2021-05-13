fun main() {
    //List
    val names = listOf("John", "Sarah", "Hank", "Katherine")
    println("1. The size of the list is: ${names.size}")
    println("2. The second item in the list is: ${names.get(1)}")
    println("3. The second item on the list using index operator: ${names[1]}")
    println("4. Katherine as the index ${names.indexOf("Katherine")} in the list")
}