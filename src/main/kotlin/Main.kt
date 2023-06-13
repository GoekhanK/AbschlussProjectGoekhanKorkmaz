import Classes.Krieger

fun main() {
    var krieger1: Krieger = Krieger("Kratos",1000.00)
    println("${krieger1.name}\nLP:${krieger1.lebensPunkte}")
    println("${krieger1.attacksOfWarrior.toList()[0]}\n${krieger1.attacksOfWarrior.toList()[1]}")
    println("${krieger1.inventoryOfAllHeroes.keys}\n${krieger1.inventoryOfAllHeroes.values}")




}

