fun parseMovieName(name: String): Int {
    return name.toInt()
}

fun main() {
    //getting the movie name from user
    //val name: String = "300"
    val name: String = "Titanic"
    try {
        val x = parseMovieName(name)
        println(x)
    } catch(ex: NumberFormatException) {
        println("Exception happened because movie name was not numeric ${ex.message}")
    } catch(ex: Exception) {
        println("Exception happened ${ex.message}")
    } finally {
        println("Finally Block")
    }
}