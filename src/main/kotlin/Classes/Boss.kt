package Classes

import Champions
import AddFromBoss
import italic
import reset
import bold
import green
import red
import yellow


open class Boss(name: String, lifePointsEnemy: Double) : Enemy(name, lifePointsEnemy) {
    var listOfBossAttacks: MutableMap<String, Int> = mutableMapOf(
        "Tail Swipe" to 30.rangeTo(35).random(),
        "Head Butt" to 40.rangeTo(45).random(),
        "Earth Quake" to 50.rangeTo(55).random(),
        "Flying Tackle" to 60.rangeTo(80).random(),
        "Spawn Add" to 0,
        "Fire Breath(Aoe)" to 0,
        "Fire Burn(Debuff)" to 0
    )

    override fun enemyAttacks(championsList: MutableList<Champions>, enemyList: MutableList<Enemy>) {
        var selectedAttack = listOfBossAttacks.keys.random()
        when (selectedAttack) {
            "Spawn Add" -> {
                enemyList.add(spawnAdd())
                listOfBossAttacks.remove("Spawn Add", 0)
            }

            "Fire Breath(Aoe)" -> fireAoe(championsList)
            "Fire Burn(Debuff)" -> enemyDebuff(championsList)
            else -> {
                val damage = listOfBossAttacks[selectedAttack]
                val target = championsList.random()
                println("${bold}${italic}${red}${name}${reset}${bold}${italic} attacks with${reset}${bold}${italic}${yellow} $selectedAttack${reset}${bold}${italic} and Deals${reset}${bold}${italic}${red} $damage ${reset}${bold}${italic}Dmg to${reset}${bold}${italic}${yellow} ${target.name}${reset}")
                if (damage != null) {
                    target.lifePoints -= damage
                }
            }
        }
    }

    override fun spawnAdd(): AddFromBoss {
        var newBossAdd = AddFromBoss("Fire Elementar", 200.0)
        println("${bold}${italic}${red}${newBossAdd.name}${reset}${bold}${italic} is spawned with${reset}${bold}${italic}${red} ${newBossAdd.lifePointsEnemy}${reset}${bold}${italic} LP${reset}")
        return newBossAdd
    }

    override fun enemyDebuff(championsList: MutableList<Champions>) {
        val target = championsList.random()
        target.debuff()
        target.counter = 3
        println("${bold}${italic}${red}${name} ${reset}${bold}${italic} attacks with Fire Burn and deals 10 % damage to${reset} ${bold}${italic}${yellow}${target.name}${reset}")
        println("${bold}${italic}${yellow}${target.name}${bold}${italic} has${reset}${bold}${italic}${green} ${target.lifePoints} ${reset}${bold}${italic}LP remaining${reset}")
    }

    override fun fireAoe(championsList: MutableList<Champions>) {
        val fireAoeDmg = 10.rangeTo(20).random()
        val target = championsList.size
        println("${bold}${italic}${red}${name}${reset}${bold}${italic} attacks with Fire Breath and deals${reset}${bold}${italic}${red} ${fireAoeDmg}${reset}${bold}${italic} damage to ${championsList.size} targets${reset}")
        for (target in championsList) {
            target.lifePoints -= fireAoeDmg
            println("${bold}${italic}${yellow}${target.name}${reset}${bold}${italic} has${reset} ${bold}${italic}${green}${target.lifePoints}${reset}${bold}${italic} LP remaining${reset}")
        }
    }
}


// Klasse Boss erstellt geerbt von Enemy Klasse
