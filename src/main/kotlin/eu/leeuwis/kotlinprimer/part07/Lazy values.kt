package eu.leeuwis.kotlinprimer.part07

fun slowFunction(): String {
    Thread.sleep(2000)
    return "Slow stuff"
}

fun main() {
    val slow = slowFunction()
//    val slow by lazy {slowFunction()}

    println("this will take some time")
    println("because this is $slow")
}
