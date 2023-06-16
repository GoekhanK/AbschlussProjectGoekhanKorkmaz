import Classes.Boss

open class Champions(var name: String, var lifePoints: Double) {
    open fun attacks(boss: Boss) {
        var listOfAttacks: MutableMap<String, Int> = mutableMapOf()
    }
}

// Klasse Champions erstellt mit eigenschaften name und lp