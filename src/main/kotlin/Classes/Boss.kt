package Classes
class Boss(var name: String, var bossLebensPunkte: Double) {
    var bossFaehigkeiten: MutableMap<String, Int> = mutableMapOf(
        "Urknall" to 150,
        "Erdbeben" to 25,
        "Spalten" to 75,
        "Flammenatem" to 200
    )
}
