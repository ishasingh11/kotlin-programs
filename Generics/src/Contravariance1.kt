package generic

//why in only?
//declaration-site variance
open class Fruit3
class Apple3: Fruit3()

//declaration-site variance
class Box3<in T>{
    fun put(item: T){}
    //fun get(): T {TODO("Return item of type T")}
}

fun main() {
    val fruitBox = Box3<Fruit3>()
    val appleBox: Box3<Apple3> = fruitBox

    //val apple: Apple3 = appleBox.get() //returns a fruit while an apple is required
}