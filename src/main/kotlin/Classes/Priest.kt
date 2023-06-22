import Classes.Enemy

open class Priest(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfPriestAttacks: MutableMap<String, Int> = mutableMapOf(
        "Mind Blast" to 25.rangeTo(35).random(),
        "Mind Explosion" to 30.rangeTo(40).random(),
        "Shadow Bolt" to 35.rangeTo(45).random(),
        "Vampiric Touch" to 45.rangeTo(55).random()
    )
    override fun attacks(enemy: Enemy) {
        while (true) {
            try {
                println("${bold}${italic}Choose an Attack 1-4${reset}")
                var index = 1
                for (attack in listOfPriestAttacks.keys) {
                    println("${bold}${italic}$index.${reset} ${bold}${italic}${yellow}$attack${reset}")
                    index++
                }
                val choice = readln()
                val selectedAttack = when (choice) {
                    "1" -> "Mind Blast"
                    "2" -> "Mind Explosion"
                    "3" -> "Shadow Bolt"
                    "4" -> "Vampiric Touch"
                    else -> throw IllegalArgumentException("${red}${bold}Wrong Choice${reset}")
                }
                val damage = listOfPriestAttacks[selectedAttack]
                println("${italic}${bold}${yellow}$name${reset}${italic}${bold} attacks with ${reset}${italic}${bold}${yellow}$selectedAttack${reset} and Deals${italic}${bold}${red} $damage${reset} Dmg to ${italic}${bold}${red}${enemy.name}${reset}")
                if (damage != null) {
                    enemy.lifePointsEnemy -= damage
                    println("${bold}${italic}${red}${enemy.name}${reset}${bold}${italic} has${reset}${bold}${italic}${red} ${enemy.lifePointsEnemy}${reset}${bold}${italic} LP remaining${reset}")
                }
                break
            } catch (e: IllegalArgumentException) {
                println("${red}Wrong Choice${reset}")
            }
        }
    }


    override fun useInventory(enemyList: MutableList<Enemy>) {
        while (inventoryList.size > 0) {
            try {
                println("${bold}${italic}1:${reset}${bold}${italic}${yellow} Heal Potion ${reset}${bold}${italic} 2:${reset}${bold}${italic}${yellow} Destruction Potion${reset}")
                var choice = readln()
                when (choice) {
                    "1" -> {
                        if (inventoryList.contains("Heal Potion")) {
                            lifePoints *= 1.5
                            println("${bold}${italic}${yellow}${name}${reset}${bold}${italic} used a Heal Potion and healed for half of their LP.${reset}")
                            println("${bold}${italic}Remaining HP:${reset}${green} $lifePoints${reset}")
                            inventoryList.remove("Heal Potion")
                            if (!inventoryList.contains("Heal Potion")) {
                                println("${red}You dont have any Heal Potions left.${reset}")
                            }
                            return
                        } else {
                            println("${red}Wrong Choice${reset}")
                        }
                    }

                    "2" -> {
                        if (inventoryList.contains("Destruction Potion")) {
                            println("${bold}${italic}All your attacks deal 100% more damage for once.${reset}")
                            for (attacks in listOfPriestAttacks.keys) {
                                listOfPriestAttacks[attacks] = listOfPriestAttacks[attacks]!! * 2
                            }
                            val target = enemyChoice(enemyList)
                            attacks(target)
                            inventoryList.remove("Destruction Potion")
                            if (!inventoryList.contains("Destruction Potion")) {
                                println("${red}You dont have any Destruction Potions left.${reset}")
                            }
                            return
                        } else {
                            println("${red}Choice${reset}")
                        }
                    }

                    else -> {
                        throw IllegalArgumentException()
                    }
                }
            } catch (e: IllegalArgumentException) {
                println("${red}Wrong Choice${reset}")
            }
        }
        if(inventoryList.size == 0){
            println("${red}your Inventory is Empty${reset}")
        }
    }
}


//  Klasse Priester erstellt mit MutableMap von attacken und Geerbt von Klasse Champions

