package Classes
import Helden
open class Priester(name: String, lebensPunkte: Double) : Helden(name, lebensPunkte) {
    var attacksOfPriest:Map<String,Int> = mapOf(
        "Schattenblitz" to 75,
        )
    var healsOfPriest:Map<String,Int> = mapOf(
        "Heilender Kreis" to 500)
}