import Classes.Enemy
import java.lang.System.exit

open class Fight(var championsList: MutableList<Champions>, var enemyList: MutableList<Enemy>) {
    fun startBattle() {
        var round = 1
        while (championsList.isNotEmpty() && enemyList.isNotEmpty()) {
            println("${italic}${bold}Round: $round:${reset}")
            for (champion in championsList) {
                if (champion.counter > 0) {
                    champion.debuff()
                    champion.counter--
                }
                println("${italic}${bold}${yellow}${champion.name}${reset}${italic}${bold} is Attacking${reset}")
                println("${bold}${italic}1:${reset}${italic}${bold}${yellow} Attack${reset}\n${italic}${bold}2:${reset}${italic}${bold}${yellow} Inventory${reset}")
                while (true) {
                    var choice = readln()
                    when (choice) {
                        "1" -> {
                            val target = enemyChoice(enemyList)
                            champion.attacks(target)
                            if (target.lifePointsEnemy <= 0.0) {
                                println("${bold}${italic}${red}${target.name}${reset}${bold}${italic} got defeated${reset}")
                                enemyList.remove(target)
                                if (enemyList.size == 0) {
                                    println("${bold}${italic}Champions Won${reset}")
                                    exit(0)
                                }
                            }
                            break

                        }

                        "2" -> {
                            println(champion.inventoryList.size)
                            if (champion.inventoryList.size > 0) {

                                champion.useInventory(enemyList)
                                break
                            } else {
                                println("${red}Your Inventory is Empty ${reset}")
                                println("${bold}${italic}1:${reset}${italic}${bold}${yellow} Attack${reset}\n${italic}${bold}2:${reset}${italic}${bold}${yellow} Inventory${reset}")

                                continue
                            }
                        }

                        else -> println("${red}Wrong Choice, Please Put 1 or 2${reset}")
                    }

                }
            }

            for (enemys in enemyList) {
                enemys.enemyAttacks(championsList, enemyList)
                println("${bold}${italic}Name:${reset} ${red}${enemys.name}${reset}${bold}${italic}   LifePoints:${reset}${red} ${enemys.lifePointsEnemy}${reset}")
                var toDelete = mutableListOf<Champions>()
                for (champions in championsList) {
                    if (champions.lifePoints <= 0) {
                        println("${bold}${italic}${yellow}${champions.name}${reset}${bold}${italic} Died${reset}")
                        toDelete.add(champions)

                    }
                }
                championsList.removeAll(toDelete)
            }
            round++
        }
        if (championsList.size <= 0) {
            println("${bold}${italic}${red}Champions Lost${reset}")
            exit(0)
        }

    }
}





