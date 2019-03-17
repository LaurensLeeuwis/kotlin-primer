package eu.leeuwis.kotlinprimer.part08

fun main() {
    fun internalFunction() : String {
        fun anotherInternalFunction() : String {
            return "This is from a function inside a function inside a function!"
        }
        return anotherInternalFunction()
    }

    println("this is the result of the internal function: ${internalFunction()}")
}
