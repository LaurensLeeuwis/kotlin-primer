package eu.leeuwis.kotlinprimer.part09

fun main() {
    fun aFunction(addition: String) = "This is a function " + addition.reversed()

    println("this is the result of the internal function: ${aFunction("doing something")}")
}
