fun begruessung() {
    val reset = "\u001B[0m"
    val bold = "\u001B[1m"
    val red = "\u001B[31m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val italic = "\u001B[3m"
    println("${bold}Welcome to the Golden Syntax$reset")
    println("${green}Are you ready to save the World?$reset")
    println("${red}The biggest Villain we've seen yet is taking over!$reset")
    println("${italic}${bold}Take your team and get his Head!!$reset")
    println("Your Journey is beginning...")
}

// Das ganze hier hab ich in Chat GPT eingetragen um mir die Farben zu ziehen
// Das mein Code auch schöner in der Konsole aussieht :)

fun main() {
    begruessung()
}
