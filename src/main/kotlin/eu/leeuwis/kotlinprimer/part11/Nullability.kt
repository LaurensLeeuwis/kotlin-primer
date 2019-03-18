package eu.leeuwis.kotlinprimer.part11

fun cantPassNull(parameter: String) {
    println("this is not null: '$parameter'")
}

fun canPassNull(parameter: String?) {
    if (parameter == null){
        println("passed null")
    } else {
        cantPassNull(parameter)
    }
}

fun main() {
    val aString : String? = null
    val anotherString : String? = "I am here!"
    val certainlyAString : String = "I am a String"

    canPassNull(aString)
    canPassNull(anotherString)

//    cantPassNull(anotherString)
    cantPassNull(certainlyAString)
}
