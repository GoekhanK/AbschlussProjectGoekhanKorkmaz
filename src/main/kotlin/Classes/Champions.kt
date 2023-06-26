import Classes.Enemy

// Klasse Champions erstellt mit eigenschaften name und lp
// alle Helden erben von dieser Klasse
open class Champions(var name: String, var lifePoints: Double) {
    var counter = 2
    fun debuff() {
        lifePoints *= 0.9
    }

    open fun attacks(enemy: Enemy) {                             // eine Methode für alle Helden um anzugreifen
        var listOfAttacks: MutableMap<String, Int> =
            mutableMapOf() // leere Mutable Map um für Attacken werte zu schaffen
    }

    var inventoryList: MutableList<String> = mutableListOf(
        "Heal Potion",
        "Destruction Potion"
    )  // Variable um allen Helden ein Inventar zuzuweisen

    open fun useInventory(enemyList: MutableList<Enemy>) {                    //Methode für inventar
    }

}