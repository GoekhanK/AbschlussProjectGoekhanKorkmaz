import Classes.Boss

open class Mage(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfMageAttacks: MutableMap<String, Int> = mutableMapOf(
        "Arcane Blast" to 100,
        "Arcane Salve" to 100,
        "Fire Bolt" to 100,
        "Frost Bolt" to 100
    )

    override fun attacks(boss:Boss) {
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
            println("$name attacks with $selectedAttack and Deals $damage Dmg to ${boss.name}")
            if (damage != null) {
                boss.lifePointsEnemy -= damage
            }
            break

        }
    }
}


//  Klasse Mage erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

