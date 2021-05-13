open class Fruit
class Apple: Fruit()

//declaration-site variance
class Box<out T>{
    fun get(): T{TODO("Return item of type T")}
}

fun main() {
    val appleBox = Box<Apple>()
    val box: Box<Fruit> = appleBox
}