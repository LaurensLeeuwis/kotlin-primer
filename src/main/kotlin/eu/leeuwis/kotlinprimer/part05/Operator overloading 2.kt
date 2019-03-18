package eu.leeuwis.kotlinprimer.part05

fun main() {
    val aMutableList = mutableListOf("a", "b", "c")
    println(aMutableList)

    aMutableList += "d"
    println(aMutableList)

    val immutableList1 = listOf("a", "b")
    val immutableList2 = listOf("c", "d")

    val immutableListsCombined = immutableList1 + immutableList2
    println(immutableListsCombined)

}
