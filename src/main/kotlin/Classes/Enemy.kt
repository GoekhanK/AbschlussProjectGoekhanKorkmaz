package Classes

import Champions
import addFromBoss
// Offene Klasse Enemy erstellt, stellt den Gegner dar.
// Alle Gegner Erben von dieser Klasse Eigenschaften: NAME / LEBENSPUNKTE
open class Enemy(var name: String, var lifePointsEnemy: Double) {

    open fun enemyAttacks(championsList: MutableList<Champions>) {         // Offene Methode nur als Platzhalter zum Erben
        println("Boss attacks")                       // enthält eine Liste von Champions. Damit man angreifen kann
    }

    open fun spawnAdd(): addFromBoss {                 // spawn Add Methode um einen UnterBoss zu erschaffen übergeben wird die
        return addFromBoss("",0.0) //importierte Klasse addFromBoss
    }

    open fun enemyDebuff(championsList: MutableList<Champions>) { // Enemy Debuff ein Fluch der auf einem Champion verweilt
    }

    open fun fireAoe(championsList: MutableList<Champions>) {   // eine Methode vom Enemy ein Feuer Flächen schaden der allen Champions LP abzieht


    }
}
