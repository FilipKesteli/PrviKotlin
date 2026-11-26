fun main() {
    zanimljivo()
}

fun zanimljivo() {
    val things = listOf("Kotlin", "Programming", "Commmic books")
    things.forEach { it ->
        println(it)
    }
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value ->
        println("$key is $value")
    }

    val things2 = mutableListOf("a", "b", "c")
    things2.add("d")
    for (item in things2) {
        println(item + " ${things2.get(2)}" + things2)
    }
}