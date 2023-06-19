package Classes

import Champions
import addFromBoss

open class Boss(name: String, lifePointsEnemy: Double) : Enemy(name, lifePointsEnemy) {
    var listOfBossAttacks: MutableMap<String, Int> = mutableMapOf(
        "Tail Swipe" to 100,
        "Head Butt" to 100,
        "Earth Quake" to 100,
        "Flying Tackle" to 100,
        "Spawn Add" to 0,
        "Fire Breath" to 0,
        "Fire Burn" to 0
    )

    override fun enemyAttacks(championsList: List<Champions>) {
        val selectedAttack = listOfBossAttacks.keys.random()
        if (selectedAttack == "Spawn Add") {
            spawnAdd()
            listOfBossAttacks.remove("Spawn Add", 0)
        } else if (selectedAttack == "Fire Breath") {
            fireAoe()
        } else if (selectedAttack == "Fire Burn") {
            enemyDebuff()
            listOfBossAttacks.remove("Fire Burn", 0)
        } else {
            val damage = listOfBossAttacks[selectedAttack]
            val target = championsList.random()
            println("$name attacks with $selectedAttack and Deals $damage Dmg to ${target.name}")
            if (damage != null) {
                target.lifePoints -= damage
                println("${target.name} has ${target.lifePoints} hp remaining")
            }
        }
    }

    override fun spawnAdd(): addFromBoss {
        var newBossAdd = addFromBoss("Fire Elementar", 1500.0)
        println("${newBossAdd.name} is spawned with ${newBossAdd.lifePointsEnemy} lifePoints")
        return newBossAdd
    }

    override fun enemyDebuff() {
        var debuff: String = "Fire Burn"
        var fireBreathDmg = 0.1
    }

    override fun fireAoe() {
        var aoe = 100

    }
}
// Klasse Boss erstellt geerbt von Enemy Klasse
