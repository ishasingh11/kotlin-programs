fun main() {
    //Range
    println("\nLine1:")
    for (i in 1..5) {
        print(i)
    }

    println("\nLine2:")
    if(4 !in 5..10){
        print("Not there")
    }

    println("\nLine3:")
    for(i in 1 until 5){
        print(i)
    }

    println("\nLine4:")
    for (i in 1..5 step 2){
        print(i)
    }

    println("\nLine5:")
    for(i in 5 downTo 1){
        print(i)
    }
}