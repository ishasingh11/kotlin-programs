fun parseMovieeName(name: String): Int {
    return name.toInt()
}

fun main() {
    //val name: String = "300"
    val name: String = "Titanic"
    val x = parseMovieeName(name)
    println(x)
}