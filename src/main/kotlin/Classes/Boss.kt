package Classes

import Champions
import Enemy
import addFromBoss

open class Boss(name: String, lifePointsEnemy: Double) : Enemy(name, lifePointsEnemy) {
    var listOfBossAttacks: MutableMap<String, Int> = mutableMapOf(
        "Tail Swipe" to 100,
        "Head Butt" to 100,
        "Earth Quake" to 100,
        "Flying Tackle" to 100,
        "Spawn Add" to 0,
        "Fire Breath" to 0
    )

    override fun enemyAttacks(championsList: List<Champions>) {
        val selectedAttack = listOfBossAttacks.keys.random()
        if (selectedAttack == "Spawn Add") {
            spawnAdd()
        } else if (selectedAttack == "Fire Breath") {
            enemyDebuff()
        } else {
            val damage = listOfBossAttacks[selectedAttack]
            val target = championsList.random()
            println("$name attacks with $selectedAttack and Deals $damage Dmg to ${target.name}")
            if (damage != null) {
                target.lifePoints -= damage
            }
        }
    }


    override fun spawnAdd() {
        var newBossAdd = addFromBoss("Fire Elementar", 1500.0)
        println("${newBossAdd.name} is spawned with ${newBossAdd.lifePointsEnemy} lifePoints")
    }

    override fun enemyDebuff() {
        var debuff: String = "Fire Breath"
        println("$debuff")
    }
}
// Klasse Boss erstellt geerbt von Enemy Klasse
