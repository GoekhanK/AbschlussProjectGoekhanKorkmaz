import Classes.Enemy
import kotlin.random.Random

open class AddFromBoss(name: String, lifePointsEnemy: Double) : Enemy(name, lifePointsEnemy) {
    var listOfaddFromBossAttacks: MutableMap<String, Int> = mutableMapOf(
        "Fire Chain from add" to 20.rangeTo(25).random(),
        "Fire Blast from add" to 25.rangeTo(30).random()
    )

    override fun enemyAttacks(championsList: MutableList<Champions>, enemyList: MutableList<Enemy>) {
        val selectedAttack = listOfaddFromBossAttacks.keys.random()
        val target = championsList.random()
        val damage = listOfaddFromBossAttacks[selectedAttack]
        println("${bold}${italic}${red}$name${reset}${bold}${italic} attacks with${reset}${bold}${italic}${yellow} $selectedAttack ${reset}${bold}${italic}and Deals ${reset}${bold}${italic}${red}$damage${reset} ${bold}${italic}Dmg to ${reset}${bold}${italic}${yellow}${target.name}${reset}")
        if (damage != null) {
            target.lifePoints -= damage


        }
    }
}

// klasse UnterBoss erstellt geeerbt von Klasse Enemy