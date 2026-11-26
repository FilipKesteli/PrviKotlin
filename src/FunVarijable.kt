fun main() {
    println(modDijeljenje(10.0, 3.0))
    println(modDijeljenje(11.0, 4.0))
    println(modDijeljenje(Math.pow(3.0,20.0), 25.0))
}

fun modDijeljenje(a: Double, b: Double): Double {
    return a.mod(b)
}