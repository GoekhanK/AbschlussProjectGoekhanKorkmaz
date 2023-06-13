package Classes
import Helden
open class Krieger(name: String, lebensPunkte: Double, inventory: Map<String, Int>) : Helden(name, lebensPunkte,
    inventory = mapOf("Heiltrank" to 1000), actions = mapOf("Heldenhafter Stoß" to 100))
