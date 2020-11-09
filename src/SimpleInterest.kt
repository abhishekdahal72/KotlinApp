fun main(){
    print("Enter first p")
    val p = readLine()!!.toFloat()
    print("Enter second t")
    val t = readLine()!!.toFloat()
    print("Enter second r")
    val r = readLine()!!.toFloat()
    val si = SI(p, t, r )

    println("Simple Interest is:"+ si)
}

fun SI(p: Float, r: Float, t: Float) : Float{
    return (p*t*r)/100
}