import java.util.*

class Shapes(input: Int) {
    fun sphere(radius: Int) {
        var lsa: Int = 4 * 3 * radius * radius
        var tsa: Int = 4 * 3 * radius * radius
        var volume: Int = 4 * radius * radius * radius
        print("$lsa $tsa $volume")
    }

    fun cylinder(radius: Int, height: Int) {
        var lsa: Int = 2 * 3 * radius * height
        var tsa: Int = 2 * 3 * ((radius * height) + (radius * radius))
        var volume: Int = 3 * radius * radius * height
        print("$lsa $tsa $volume")
    }

    fun cube(side: Int) {
        var lsa: Int = 4 * side * side
        var tsa: Int = 6 * side * side
        var volume: Int = side * side * side
        print("$lsa $tsa $volume")
    }
}
fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    var input = read.nextInt()
    val shapes = Shapes(input)
    when(input) {
        1 -> {
            val radius = read.nextInt()
            shapes.sphere(radius)
        }
        2 -> {
            val radius = read.nextInt()
            val height = read.nextInt()
            shapes.cylinder(radius, height)
        }
        3 -> {
            val side = read.nextInt()
            shapes.cube(side)
        }
    }
}