package eu.leeuwis.kotlinprimer.part10

data class FirstType(val amount : Int)
data class SecondType(val text : String)

fun smartCasting(anObject: Any) {
    if (anObject is FirstType) {
        println("this is the first type. The amount is ${anObject.amount}")
    } else if (anObject is SecondType) {
        println("this is the second type. The text is '${anObject.text}'")
    }
}

fun main() {
    smartCasting(FirstType(4))

    smartCasting(SecondType("hello Brainbits!"))
}