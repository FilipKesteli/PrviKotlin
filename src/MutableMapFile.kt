fun main() {
    mutabMap()
    val things = listOf("Kotlin", "Programming", "Commmic books")
    val heyy = "Heyy"
    sayy(heyy, things)
}

fun mutabMap() {
    val mapa = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapa.put(4, "d")
    println(mapa)
}

fun sayy(greetings: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach{ item ->
        println("Greeting: $greetings $item")
    }
}