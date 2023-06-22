import Classes.Enemy

open class Warrior(name: String, lifePoints: Double) : Champions(name, lifePoints) {
    var listOfWarriorAttacks: MutableMap<String, Int> = mutableMapOf(
        "Heroic Strike" to 25.rangeTo(35).random(),
        "Slam" to 30.rangeTo(40).random(),
        "Whirl Whind" to 35.rangeTo(45).random(),
        "Shield Slam" to 45.rangeTo(55).random()
    )
    override fun attacks(enemy: Enemy) {
        val attack = true
        while (attack) {
            try {
                println("${bold}${italic}Choose an Attack 1-4${reset}")
                var index = 1
                for (attack in listOfWarriorAttacks.keys) {
                    println("${bold}${italic}$index.${reset} ${bold}${italic}${yellow}$attack${reset}")
                    index++
                }
                val choice = readln()
                val selectedAttack = when (choice) {
                    "1" -> "Heroic Strike"
                    "2" -> "Slam"
                    "3" -> "Whirl Whind"
                    "4" -> "Shield Slam"
                    else -> throw IllegalArgumentException("${red}Wrong Choice${reset}")
                }
                val damage = listOfWarriorAttacks[selectedAttack]
                println("${italic}${bold}${yellow}$name${reset}${italic}${bold} attacks with ${reset}${italic}${bold}${yellow}$selectedAttack${reset} and Deals${italic}${bold}${red} $damage${reset} Dmg to ${italic}${bold}${red}${enemy.name}${reset}")
                if (damage != null) {
                    enemy.lifePointsEnemy -= damage
                    println("${bold}${italic}${red}${enemy.name}${reset}${bold}${italic} has${reset}${bold}${italic}${red} ${enemy.lifePointsEnemy}${reset}${bold}${italic} LP remaining${reset}")
                }
                break
            } catch (e: IllegalArgumentException) {
                println(("${red}Wrong Choice${reset}"))
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
                            for (attacks in listOfWarriorAttacks.keys) {
                                listOfWarriorAttacks[attacks] = listOfWarriorAttacks[attacks]!! * 2
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
