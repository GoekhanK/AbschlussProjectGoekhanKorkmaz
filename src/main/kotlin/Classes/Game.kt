import Classes.Enemy

open class Game(var championsList: List<Champions>, var enemyList: List<Enemy>) {
    fun startBattle() {
        var round = 1
        while (championsList.isNotEmpty() && enemyList.isNotEmpty()) {
            println("Round: $round:")
            for (champion in championsList) {
                println("${champion.name} is Attacking")
                println("1: Attack, 2: Inventory")
                var choice = readln()
                if (choice == "1") {
                    println("${champion.name} is Attacking.")
                    champion.attacks(enemyList.first())
                    if (enemyList.first().lifePointsEnemy <= 0) {
                        println("Algalon got defeated")
                        break
                    }
                } else {
                    println("Wrong Choice")
                }
            }
            enemyList.first().enemyAttacks(championsList)
            //liste champions auf lp überprüfen
            //status aller anzeigen
            round++
        }
    }
}

