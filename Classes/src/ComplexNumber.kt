import java.util.*

class ComplexNumber(real:Int, img:Int) {
    //write your code here
    private var real: Int
    private var img: Int

    init{
        this.real = real
        this.img = img
    }

    fun print() {
        println("$real + i$img")
    }

    fun add(num2: ComplexNumber) {
        real += num2.real
        img += num2.img
    }

    fun multiply(num2: ComplexNumber) {
        val newreal = real * num2.real - img * num2.img
        val newimg = real * num2.img + img * num2.real
        real = newreal
        img = newimg
    }
}

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val num1Real = read.nextInt()
    val num1Img = read.nextInt()
    val complex1 = ComplexNumber(num1Real, num1Img)

    val num2Real = read.nextInt()
    val num2Img = read.nextInt()
    val complex2 = ComplexNumber(num2Real, num2Img)

    when(read.nextInt()) {
        1 -> {
            complex1.add(complex2)
            complex1.print()
        }
        2 -> {
            complex1.multiply(complex2)
            complex1.print()
        }
    }
}