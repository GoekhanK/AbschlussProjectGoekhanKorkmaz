import Classes.Enemy

open class Warrior(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfWarriorAttacks: MutableMap<String, Int> = mutableMapOf(
        "Heroic Strike" to 100,
        "Slam" to 100,
        "Whirl Whind" to 100,
        "Shield Slam" to 100
    )

    override fun attacks(enemy: Enemy) {
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
            println("$name Attacks with $selectedAttack and Deals $damage Dmg to ${enemy.name}")
            if (damage != null) {
                enemy.lifePointsEnemy -= damage
            }
            break
        }
    }

    override fun useInventory() {
        println("1: Heal Potion, 2: Destruction Potion")
        var choice = readln()
        if (choice == "1") {
            lifePoints *= 1.5
            println("${name} used Heal Potion and Healed for the half of his Hp")
            println("remaining Hp: ${lifePoints}")
        } else if (choice == "2") {
            println("not available RN")
        } else
            println("Wrong Choice")
    }
}

//  Klasse Warrior erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

