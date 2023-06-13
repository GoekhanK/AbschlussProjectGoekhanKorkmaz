package Classes
import Helden
open class Magier(name: String, lebensPunkte: Double, inventory: Map<String, Int>) : Helden(name, lebensPunkte,
    inventory = mapOf("Heiltrank" to 1000), actions = mapOf("Arkanschlag" to 125))
