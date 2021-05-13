fun <T: Any> printPrice(price: T) {
    println("The price is $price")
}

fun main() {
    printPrice<Int>(23)
    printPrice<Double>(24.5)

    printPrice<String>("John")

    val price: Int? = null
    //printPrice<Int?>(price)
}