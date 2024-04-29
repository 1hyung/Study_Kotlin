package org.example

class Enemy(
    val name: String
) {
    val attackPoint: Int = 10
    var healthPoint: Int = 100

    fun takeAttack(damage: Int) {
        println("공격 받았다!")
        healthPoint -= damage
    }
}