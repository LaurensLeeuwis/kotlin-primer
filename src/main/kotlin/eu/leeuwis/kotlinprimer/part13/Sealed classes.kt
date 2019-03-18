package eu.leeuwis.kotlinprimer.part13

sealed class ApplicationState {
    object Loading : ApplicationState()
    data class Error(val message: String) : ApplicationState()
    data class Result(val greet: String, val subject: String) : ApplicationState()
}

fun handleState(appState: ApplicationState){
    when(appState) {
        is ApplicationState.Error -> println("oopsie.. ${appState.message}")
        is ApplicationState.Result -> println("${appState.greet} ${appState.subject} !!")
        ApplicationState.Loading -> println("Still loading")
    }
}

fun main() {
    handleState(ApplicationState.Loading)

    handleState(ApplicationState.Error("didn't pass a Result but an Error"))

    handleState(ApplicationState.Result("Hello", "Brainbits"))
}
