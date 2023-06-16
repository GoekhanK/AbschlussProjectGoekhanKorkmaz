import Classes.Boss

open class Game(var championsList: List<Champions>, var boss: Boss) {
    fun startBattle() {
        var round = 1
        var isFighting = true
        while (isFighting) {
            println("Round: $round:")
            for (champion in championsList) {
                println("${champion.name} is Attacking.")
                champion.attacks(boss)
            }
            boss.enemyAttacks(championsList)
            //status aller anzeigen
            round++
        }

    }
}

