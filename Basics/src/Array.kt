fun main() {
    //Array
    val numbers = arrayOf(1,2,3,4)

    println("The number at second position: ${numbers.get(1)}")
    println("The number at third position: ${numbers[2]}")
    numbers.set(3,5)
    numbers[1]=22
    println(numbers.joinToString(","))

    val numbersZero = Array(5){0}
    println(numbersZero.joinToString(","))
}