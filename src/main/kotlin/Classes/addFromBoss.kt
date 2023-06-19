import Classes.Enemy

open class addFromBoss(name: String, lifePointsEnemy: Double) : Enemy(name, lifePointsEnemy) {
    override fun enemyAttacks(championsList: List<Champions>) {
        var listOfaddFromBossAttacks: MutableMap<String, Int> = mutableMapOf(
            "Fire Chain" to 100,
            "Fire Blast" to 100
        )
    }
}
// klasse UnterBoss erstellt geeerbt von Klasse Enemy