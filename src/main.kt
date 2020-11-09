fun main() {

//    val a = 3
//    val b = 2
    print("Enter first no")
    val a = readLine()!!.toInt()
    print("Enter second no")
    val b = readLine()!!.toInt()
    val c = add(a, b)

    println("Sum of $a and $b is $c")
    addAnother(a,b)
    println("Sum of $a and $b is $c")
}

fun addAnother(a: Int, b: Int){
    val c = a+b
}

fun add(a: Int, b: Int)
        : Int {
    return a + b
}