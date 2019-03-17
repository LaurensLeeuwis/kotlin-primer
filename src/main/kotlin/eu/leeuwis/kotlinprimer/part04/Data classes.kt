package eu.leeuwis.kotlinprimer.part04

data class Greet(val greet: String, val subject: String)

fun main() {
    val brainBitGreet = Greet("Hello", "Brain bits")

    println(brainBitGreet)
    println("${brainBitGreet.greet} ${brainBitGreet.subject} !!")
}
