fun a() {
    println("a() is called")
    b()
    println("a() is finishing")
}

fun b() {
    println("b() is called")
    c()
    println("b() is finishing")
}

fun c() {
    println("c() is called")
}

fun main() {
    a()
}