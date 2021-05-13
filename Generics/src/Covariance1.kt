package generic

//why return only?
open class Fruit1
class Apple1: Fruit1()
class Orange: Fruit1()

//declaration-site variance
class Box1<out T>{
    fun get(): T {TODO("Return item of type T")}
    //fun put(item: T) {}
}

fun main() {
    val appleBox = Box1<Apple1>()
    val fruitBox: Box1<Fruit1> = appleBox
    //fruitBox.put(Orange()) //we are able to put an orange in a box of apple
}