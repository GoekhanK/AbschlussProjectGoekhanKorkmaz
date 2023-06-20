import Classes.Enemy

// Klasse Champions erstellt mit eigenschaften name und lp
// alle Helden erben von dieser Klasse
open class Champions(var name: String, var lifePoints: Double) {
    open fun attacks(enemy:Enemy) {                             // eine Methode für alle Helden um anzugreifen
        var listOfAttacks: MutableMap<String, Int> = mutableMapOf() // leere Mutable Map um für Attacken werte zu schaffen
    }
    var inventoryList: List<String> = listOf("Heal Potion", "Destruction Potion")  // Variable um allen Helden ein Inventar zuzuweisen
    open fun useInventory(){                    //Methode für inventar
    }
}