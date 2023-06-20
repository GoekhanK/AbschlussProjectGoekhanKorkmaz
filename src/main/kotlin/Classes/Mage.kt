import Classes.Enemy

open class Mage(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfMageAttacks: MutableMap<String, Int> = mutableMapOf(
        "Arcane Blast" to 100,
        "Arcane Salve" to 100,
        "Fire Bolt" to 100,
        "Frost Bolt" to 100
    )

    override fun attacks(enemy: Enemy) {
        val attack = true
        while (attack) {
            println("Choose an Attack 1-4")
            var index = 1
            for (attack in listOfMageAttacks.keys) {
                println("$index. $attack")
                index++
            }
            val choice = readln()
            val selectedAttack = when (choice) {
                "1" -> "Arcane Blast"
                "2" -> "Arcane Salve"
                "3" -> "Fire Bolt"
                "4" -> "Frost Bolt"
                else -> {
                    println("Wrong Choice")
                }
            }
            val damage = listOfMageAttacks[selectedAttack]
            println("$name attacks with $selectedAttack and Deals $damage Dmg to ${enemy.name}")
            if (damage != null) {
                enemy.lifePointsEnemy -= damage
                println("${enemy.lifePointsEnemy} hp remaining")
            }
            break

        }
    }

    override fun useInventory() {
        println("1: Heal Potion\n2: Destruction Potion")
        var choice = readln()
        if (choice == "1") {
            lifePoints *= 1.5
            println("${name} used Heal potion and Healed for the Half of his Hp")
            println("remaining Hp: ${lifePoints}")
        } else if (choice == "2") {
            println("not available RN")
        } else
            println("Wrong Choice")
    }
}


//  Klasse Mage erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

