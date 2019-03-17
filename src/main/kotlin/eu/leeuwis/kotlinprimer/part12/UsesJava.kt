package eu.leeuwis.kotlinprimer.part12

fun main() {
    val fromJava = Java()
    println(fromJava.thisIsJava())

    println(Java.cyclic())
}