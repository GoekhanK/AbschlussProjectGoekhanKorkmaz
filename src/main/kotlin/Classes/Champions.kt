import Classes.Enemy

// Klasse Champions erstellt mit eigenschaften name und lp
// alle Helden erben von dieser Klasse
open class Champions(var name: String, var lifePoints: Double) {
    open fun attacks(enemy:Enemy) {
        var listOfAttacks: MutableMap<String, Int> = mutableMapOf()
    }
    var inventoryList: List<String> = listOf("")
}