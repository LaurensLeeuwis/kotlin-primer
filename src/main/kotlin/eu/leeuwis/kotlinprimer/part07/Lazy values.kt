package eu.leeuwis.kotlinprimer.part07

fun `slow function`(): String {
    Thread.sleep(3000)
    return "Slow stuff"
}

fun main() {
    val slow = `slow function`()
//    val slow by lazy {`slow function`()}

    println("this will take some time")
    println("because this is $slow")
}
