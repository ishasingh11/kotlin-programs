fun main() {
    //For loop
    val names = arrayOf("John", "Hank", "Dave")

    for(name in names){
        println(name)
    }

    for(i in names.indices){
        println(names[i])
    }
}