open class Fruit2
class Apple2: Fruit2()

//declaration-site variance
class Box2<in T>{
    fun put(item: T){}
}

fun main() {
    val fruitBox = Box2<Fruit2>()

    val appleBox: Box2<Apple2> = fruitBox
}