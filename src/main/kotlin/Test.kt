import Classes.*

fun main(){
    var mage1:Mage = Mage("Mage Punk",1500.0)
    var warrior1:Warrior = Warrior("Warrior Slayer",1000.0)
    var priest1: Priest = Priest("Priest Shadow",1000.0)
    var listChampions:List<Champions> = listOf(mage1,warrior1,priest1)
    var adboss:addFromBoss = addFromBoss("Gruul",1000.0)
    var boss: Enemy = Enemy("Algalon",10000.0)
    var addBoss1:addFromBoss = addFromBoss("Gruul",1500.0)
    var listEnemy:List<Enemy> = listOf(boss,addBoss1)
    Game(listChampions,listEnemy).startBattle()
}