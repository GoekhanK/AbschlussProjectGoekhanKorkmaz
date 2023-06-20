import Classes.*

fun main(){
    var mage1:Mage = Mage("Mage Punk",200.0)
    var warrior1:Warrior = Warrior("Warrior Slayer",200.0)
    var priest1: Priest = Priest("Priest Shadow",200.0)
    var listChampions:MutableList<Champions> = mutableListOf(mage1,warrior1,priest1)
    var adboss:addFromBoss = addFromBoss("Gruul",200.0)
    var boss: Boss = Boss("Algalon",1000.0)
    var addBoss1:addFromBoss = addFromBoss("Gruul",150.0)
    var listEnemy:MutableList<Enemy> = mutableListOf(boss,addBoss1)
    Game(listChampions,listEnemy).startBattle()
}

