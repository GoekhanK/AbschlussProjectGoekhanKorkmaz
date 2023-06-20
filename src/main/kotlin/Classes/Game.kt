import Classes.Boss
import Classes.Enemy

open class Game(var championsList: MutableList<Champions>, var enemyList: MutableList<Enemy>) {
    fun startBattle() {
        var round = 1
        while (championsList.isNotEmpty() && enemyList.isNotEmpty()) {
            println("Round: $round:")
            for (champion in championsList) {
                println("${champion.name} is Attacking")
                if (champion.lifePoints <= 0.0) {
                    println("${champion.name} died")
                    championsList.remove(champion)
                    continue
                }
                println("1: Attack\n2: Inventory")
                var choice = readln()
                if (choice == "1") {
                    champion.attacks(enemyList.first())
                } else if (choice == "2") {
                    champion.useInventory()
                } else {
                    println("Wrong Choice")
                }
            }
            enemyList.first().enemyAttacks(championsList)
            if (enemyList.first().lifePointsEnemy <= 0.0 || enemyList.last().lifePointsEnemy <= 0.0) {
                println("Algalon got defeated")
                break
            }
            round++
        }
    }
}


