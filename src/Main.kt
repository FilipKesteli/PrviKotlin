val name3: String = "Hal"
val name4: String? = null
var greeting: String? = null

/**
 * greeting variable se promijeni i ostaje promijenjeno i izvan funkcije
 */
fun isNull() {
    greeting = "Nate"
    if (greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }
}

fun proba() {
    println("Hello Kotlin")
}

fun variables() {
    var a = 10
    val name: String = "Nate"
    var name2: String = "Fil"
    name2 = "ggg"
    println(name2)
}

/**
 * greeting variable se promijeni i ostaje promijenjeno i izvan funkcije
 */
fun whenStatement() {
    when (greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
}

fun isGreeting() {
    val greetingPrint = if (greeting != null) greeting else "Hi"
    println(greetingPrint)
}

fun whenGreeting() {
    val greet = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
}

fun main() {
    proba()
    variables()
    println(name3)
    isNull()
    whenStatement()
    isGreeting()
    whenGreeting()
    println(funckija(2,5))
}




