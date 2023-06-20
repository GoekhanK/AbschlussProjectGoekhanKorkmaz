import Classes.Enemy

open class Priest(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfPriestAttacks: MutableMap<String, Int> = mutableMapOf(
        "Mind Blast" to 100,
        "Mind Explosion" to 100,
        "Shadow Bold" to 100,
        "Vampiric Touch" to 100
    )

    override fun attacks(enemy: Enemy) {
        val attack = true
        while (attack) {
            println("Choose an Attack 1-4")
            var index = 1
            for (attack in listOfPriestAttacks.keys) {
                println("$index. $attack")
                index++
            }
            val choice = readln()
            val selectedAttack = when (choice) {
                "1" -> "Mind Blast"
                "2" -> "Mind Explosion"
                "3" -> "Shadow Bold"
                "4" -> "Vampiric Touch"
                else -> {
                    println("Wrong Choice")

                }
            }
            val damage = listOfPriestAttacks[selectedAttack]
            println("$name attacks with $selectedAttack and Deals $damage Dmg to ${enemy.name}")
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

//  Klasse Priester erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

