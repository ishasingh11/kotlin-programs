class ListExample{
    //Use-site Variance / Type Projection
    fun copy(from: MutableList<out Any>, to:MutableList<Any>) {
        for (i in from.indices) {
            to.add(from[i])
        }
    }
}

fun main() {
    val any: MutableList<Any> = mutableListOf("John",7)
    val numbers: MutableList<Int> = mutableListOf(1,2,3)
    ListExample().copy(numbers,any)
}