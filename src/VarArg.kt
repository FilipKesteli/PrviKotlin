fun main() {
    val things = arrayOf("Kotlin", "Programming", "Commmic books")
    sayy2("Hi")
    sayy2("Hi", *things)
    sayy2("Hi", "Kotlin", "Programming", "Books")
}

fun varAr() {

}

fun sayy2(greetings: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach{ item ->
        println("Greeting: $greetings $item")
    }
}