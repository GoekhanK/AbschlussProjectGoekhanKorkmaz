import Classes.*

fun main(){
    var mage1:Mage = Mage("Mage",1500.0)
    var warrior1:Warrior = Warrior("Warrior",1000.0)
    var priest1: Priest = Priest("Priest",1000.0)
    var list:List<Champions> = listOf(mage1,warrior1,priest1)
    var adboss:addFromBoss = addFromBoss("idiot",1000.0)
    var boss:Boss = Boss("Algalon",10000.0)
    Game(list,boss).startBattle()
}