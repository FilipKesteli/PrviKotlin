fun main() {
    sayHelloo()
    println(say("Gdje si"))
    println(say("Hellou Wrl"))
    println(greet("Helloooo", "Wwwworld"))
}

fun sayHelloo(): Unit {
    println("Hello Kotlin")
}

fun say(itemToGreet: String): String {
    val messageee = "Hello $itemToGreet"
    return messageee
}

fun greet(greeting: String, item: String): String {
    return "$greeting $item"
}