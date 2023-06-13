package Classes
open class Consumables(var name: String) {
    var consumes:MutableMap<String,Int> = mutableMapOf(
        "HeilTrank" to 250,
        "ManaTrank" to 250,
    )
}