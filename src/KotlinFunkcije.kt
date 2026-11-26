fun funckija(x: Int, y: Int): Int {
    return x + y
}

fun getGreeting(): String {
    println("Hello World")
    return "Hello Kotlin"
}

fun sayHello(): Unit {
    println(getGreeting())
}

fun sayHi(): String = "Helloooooo"

fun main() {
    println(funckija(2, 7))
    println(getGreeting())
    sayHello()
    println(sayHi())
}