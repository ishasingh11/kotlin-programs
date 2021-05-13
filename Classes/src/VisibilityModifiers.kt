//default public
private fun outsideFunction() {
    println("This is outsideFunction")
}

//default public
var outSideProperty: String = "outside"

class Teacher() {
    private var onLeave = false
    protected var parkingSlot = 1
    internal val school = "DP School"
    //default public
    val name ="John"
    //default public
    fun isAvailable() = !onLeave
}

fun main() {
    println(outsideFunction())
    val teacher = Teacher()
    //println("Teacher is on leave: ${teacher.onLeave}")
    //println("Teacher has parking slot: ${teacher.parkingSlot}")
    println("The school is: ${teacher.school}")
    println("Teacher's name is: ${teacher.name}")
    println("Teacher is available: ${teacher.isAvailable()}")
}