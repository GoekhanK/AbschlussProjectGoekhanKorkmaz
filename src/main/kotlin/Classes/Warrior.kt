

import Champions
import Classes.Boss

open class Warrior(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfWarriorAttacks: MutableMap<String, Int> = mutableMapOf(
        "Heroic Strike" to 100,
        "Slam" to 100,
        "Whirl Whind" to 100,
        "Shield Slam" to 100
    )

    override fun attacks(boss: Boss) {
        val attack = true
        while (attack) {
            println("Choose an Attack 1-4")
            var index = 1
            for (attack in listOfWarriorAttacks.keys) {
                println("$index. $attack")
                index++
            }
            val choice = readln()
            val selectedAttack = when (choice) {
                "1" -> "Heroic Strike"
                "2" -> "Slam"
                "3" -> "Whirl Whind"
                "4" -> "Shield Slam"
                else -> {
                    println("Wrong Choice")
                }
            }
            val damage = listOfWarriorAttacks[selectedAttack]
            println("$name Attacks with $selectedAttack and Deals $damage Dmg to ${boss.name}")
            if (damage != null) {
                boss.lifePointsEnemy -= damage
            }
            break
        }
    }
}

//  Klasse Warrior erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

