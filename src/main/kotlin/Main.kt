import Classes.Boss
import Classes.Enemy
val reset = "\u001B[0m"
val bold = "\u001B[1m"
val red = "\u001B[31m"
val green = "\u001B[32m"
val yellow = "\u001B[33m"
val italic = "\u001B[3m"
val sleepTime = 1000    // nur eine stelle wo man es ändern muss globale variable
fun main() {
    println("${bold}Before we start Please make sure you always Type numbers${reset}")
    println("${bold}This Mini Role Play Game is written for Console Input${reset}")
    println("${bold}Have Fun !!${reset}")
    Thread.sleep(sleepTime*3.toLong())
    begruessung()
    Thread.sleep((sleepTime*2.5).toLong())
    var mage1: Mage = Mage("Millhouse Manastorm", 180.0)
    var warrior1: Warrior = Warrior("Brann Bronzebart", 200.0)
    var priest1: Priest = Priest("Jeyna Priestlie", 220.0)
    var listChampions: MutableList<Champions> = mutableListOf(mage1, warrior1, priest1)
    var boss: Boss = Boss("Algalon", 500.0)
    var listEnemy: MutableList<Enemy> = mutableListOf(boss)


    println("${italic}${bold}${yellow}Your Journey is beginning...${reset}")
    println("${italic}${bold}These are your Champions:")
    Thread.sleep((sleepTime*2.5).toLong())
    println("${italic}${bold}Mage: ${reset} ${yellow}${bold}${mage1.name}${reset}${italic}${bold}   Life Points:${reset} ${green}${italic}${bold}${mage1.lifePoints}${reset}")
    Thread.sleep((sleepTime*1.5).toLong())
    println("${italic}${bold}Warrior: ${reset}${yellow}${bold}${warrior1.name}${reset}${italic}${bold}  Life Points:${reset} ${green}${italic}${bold}${warrior1.lifePoints}${reset}")
    Thread.sleep((sleepTime*1.5).toLong())
    println("${italic}${bold}Priest: ${reset} ${yellow} ${bold}${priest1.name}${reset}${italic}${bold}  Life Points:${reset} ${green}${italic}${bold}${priest1.lifePoints}${reset}")
    Thread.sleep((sleepTime*1.5).toLong())
    println("The Fight is Starting soon\nPlease wait a moment..")
    Thread.sleep((sleepTime*5).toLong())
    println("${bold}${red}Your Enemy is ${boss.name} and he has ${boss.lifePointsEnemy} LifePoints${reset}")
    println("${bold}${yellow}To win the Fight decrease his LifePoints to 0${reset}")
    Thread.sleep((sleepTime*1.5).toLong())
    println("${bold}${italic}Good Luck${reset}")
    Thread.sleep((sleepTime*1.5).toLong())
    Fight(listChampions, listEnemy).startBattle()
}