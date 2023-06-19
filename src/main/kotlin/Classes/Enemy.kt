package Classes

import Champions
import addFromBoss

open class Enemy(var name: String, var lifePointsEnemy: Double) {
    open fun enemyAttacks(championsList: List<Champions>) {
    }

    open fun spawnAdd(): addFromBoss {
        return addFromBoss("",0.0)
    }

    open fun enemyDebuff() {
    }

    open fun fireAoe() {


    }
}
