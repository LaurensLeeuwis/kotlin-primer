package eu.leeuwis.kotlinprimer.part02

fun main() {
    val anImmutableList : List<String> = listOf("a", "b", "c")
    println(anImmutableList)

//    anImmutableList.add("d")

    val aMutableList : MutableList<String> = mutableListOf("a", "b", "c")
    println(aMutableList)

    aMutableList.add("d")
    println(aMutableList)
}
