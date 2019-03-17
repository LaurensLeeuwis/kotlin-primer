package eu.leeuwis.kotlinprimer.part10

sealed class ApplicationState

object Loading : ApplicationState()
data class Error(val message: String) : ApplicationState()
data class Result(val greet: String, val subject: String) : ApplicationState()

fun handleState(appState: ApplicationState){
    when(appState) {
        is Error -> println("oopsie.. ${appState.message}")
        is Result -> println("${appState.greet} ${appState.subject} !!")
        is Loading -> println("Still loading")
    }
}

fun main() {
    handleState(Loading)

    handleState(Error("didn't pass a Result but an Error"))

    handleState(Result("Hello", "Brainbits"))
}
