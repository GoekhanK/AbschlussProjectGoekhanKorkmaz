import Classes.*

fun main() {
    begruessung()
    var mage1: Mage = Mage("Mana Millhouse", 20.0)
    var warrior1: Warrior = Warrior("Nainor Blacksmith", 20.0)
    var priest1: Priest = Priest("Cailea Priestlie", 20.0)
    var listChampions: MutableList<Champions> = mutableListOf(mage1, warrior1, priest1)
    var boss: Boss = Boss("Algalon", 500.0)
    var listEnemy: MutableList<Enemy> = mutableListOf(boss)
    println("${italic}${bold}${yellow}Your Journey is beginning...${reset}")
    println("${italic}${bold}These are your Champions:")
    println("${yellow}${mage1.name} ${reset} || ${yellow} ${warrior1.name}${reset} || ${yellow}  ${priest1.name}${reset}")
    println("The Fight is Starting soon\nPlease wait a moment..")
    //Thread.sleep(5000)
    println("${bold}${red}Your Enemy is ${boss.name} and he has ${boss.lifePointsEnemy} LifePoints${reset}")
    println("${bold}${yellow}To win the Fight decrease his LifePoints to 0${reset}")
    Fight(listChampions, listEnemy).startBattle()
}



