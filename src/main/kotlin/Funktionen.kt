import Classes.Enemy

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
}

// Das ganze hier hab ich in Chat GPT eingetragen um mir die Farben zu ziehen
// Das mein Code auch schöner in der Konsole aussieht :)

/*fun enemyChoice(enemyList: MutableList<Enemy>): Enemy {
    var i = 0
    println("Who do you want to Attack?")
    for (enemys in enemyList) {
        println("$i: ${enemys.name}")
        i++
    }
    var choice2 = readln().toInt()
    val target = enemyList[choice2]
    return target
}*/

fun main() {
    begruessung()
}

fun enemyChoice(enemyList: MutableList<Enemy>): Enemy {
    while (true) {
        var i = 0
        println("${bold}${italic}Who do you want to Attack?${reset}")
        for (enemys in enemyList) {
            println("${bold}${italic}$i:${reset} ${bold}${italic}${red}${enemys.name}${reset}")
            i++
        }
        try {
            var choice2 = readln().toInt()
            val target = enemyList[choice2]
            return target
        } catch (e: NumberFormatException) {
            println("${red}Wrong Choice${reset}")
        } catch (e: IndexOutOfBoundsException) {
            println("${red}Wrong Choice${reset}")
        }
    }
}

