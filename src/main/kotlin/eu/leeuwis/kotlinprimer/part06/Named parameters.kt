package eu.leeuwis.kotlinprimer.part06

fun greet(greet: String = "Hello", subject: String = "World"){
    println("$greet $subject !!")
}

fun main() {
    greet()

    greet("Hi")

    greet("Hi", "Brainbits")

    greet(greet = "Hi", subject = "Brainbits")

    greet(subject = "Brainbits")
}
