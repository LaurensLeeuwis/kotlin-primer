package eu.leeuwis.kotlinprimer.part05

data class Kilometer(val amount: Int) {
    operator fun plus(another: Kilometer) : Kilometer {
        return Kilometer(amount + another.amount)
    }
}

fun main() {
    val officeToHome = Kilometer(16)
    val homeToCinema = Kilometer(5)

    val drivenDistance = officeToHome + homeToCinema

    println("I drove $drivenDistance today")
}
