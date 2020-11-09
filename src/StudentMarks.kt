fun main() {
    print("Enter a iot marks")
    val iot = readLine()!!.toFloat()

    print("Enter a android marks")
    val android = readLine()!!.toFloat()

    print("Enter a webapi marks")
    val webapi = readLine()!!.toFloat()

    val stu_per = StuPer(iot, android, webapi)

    println("Student got" + stu_per + "%")
}

fun StuPer(iot: Float, android: Float, webapi: Float): Float {

    when (iot+android+webapi/300*100) {
        in (0..39) -> println("student is fail")
        in (40..49) -> println("student got 3rd division")
        in (50..59) -> println("student got 2nd division")
        in (60..69) -> println("student got 1st division")
    }
    return (iot + android + webapi) / 100 * 100
}