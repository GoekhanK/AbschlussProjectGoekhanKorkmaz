

open class Enemy(var name: String, var lifePointsEnemy: Double) {
    open fun enemyAttacks(championsList: List<Champions>) {
        var listOfEnemyAttacks: MutableMap<String, Int> = mutableMapOf()
    }

    open fun enemyDebuff() {
        var debuff: String = ""
    }

    open fun spawnAdd() {
        var newBoss = addFromBoss("", 0.0)
    }
}
//  Klasse Enemy erstellt mit eigenschaften name , lp

