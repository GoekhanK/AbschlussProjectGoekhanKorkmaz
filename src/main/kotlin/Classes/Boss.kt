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
        "Fire Breath(Aoe)" to 0,
        "Fire Burn(Debuff)" to 0
    )
    override fun enemyAttacks(championsList: MutableList<Champions>) {
        val selectedAttack = listOfBossAttacks.keys.random()
        if (selectedAttack == "Spawn Add") {
            spawnAdd()
            listOfBossAttacks.remove("Spawn Add", 0)
        } else if (selectedAttack == "Fire Breath") {
            fireAoe(championsList)
        } else if (selectedAttack == "Fire Burn") {
            enemyDebuff(championsList)
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

    override fun enemyDebuff(championsList: MutableList<Champions>) {
        val fireBurnDebuff = 1.1
        val target = championsList.random()
        println("${name} attacks with Fire Burn and deals ${fireBurnDebuff} damage to ${target.name} targets")
        for (target in championsList) {
            target.lifePoints *= fireBurnDebuff
            println("${target.name} has ${target.lifePoints} HP remaining")
        }
    }

    override fun fireAoe(championsList: MutableList<Champions>) {
        val fireAoeDmg = 100
        println("${name} attacks with Fire Breath and deals ${fireAoeDmg} damage to ${championsList.size} targets")
        for (target in championsList) {
            target.lifePoints -= fireAoeDmg
            println("${target.name} has ${target.lifePoints} HP remaining")
        }
    }
}


// Klasse Boss erstellt geerbt von Enemy Klasse
