package eu.leeuwis.kotlinprimer.part13

enum class AppState {
    ERROR,
    RESULT,
    LOADING
}

fun handleState(appState: AppState){
    when(appState) {
        AppState.ERROR -> println("Oopsie..")
        AppState.RESULT -> println("Result!!")
        AppState.LOADING -> println("Still loading")
//        else -> println("something else?")
    }
}

fun main() {
    handleState(AppState.LOADING)

    handleState(AppState.ERROR)

    handleState(AppState.RESULT)
}
