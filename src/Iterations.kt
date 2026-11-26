fun main() {
    interestThings()
}

fun interestThings() {
    val things = arrayOf("Kotlin", "Programming", "Commmic books")
    println(things.size)
    println(things[0])
    println(things.get(0))

    for (thing in things) {
        println(thing)
    }

    things.forEach {
        println(it)
    }

    things.forEach { thing ->
        println(thing)
    }

    things.forEachIndexed { index, intereTh ->
        println("There is $index and $intereTh")
    }

}