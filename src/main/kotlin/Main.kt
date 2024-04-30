package org.example

/*//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}*/
/*
// 3-1 객체지향 코드 예시
class Hero {
    var damage = 10
    var healthPoint = 100

    fun attack(target: Enemy) {
        println("공격했다!")
        target.takeAttack(this.damage)
    }
}

class Enemy {
    var damage = 10
    var healthPoint = 100

    fun takeAttack(damage: Int) {
        println("공격받았다!")
        this.healthPoint -= damage
    }
}


fun main() {
    val hero = Hero()
    val enemy = Enemy()

    hero.attack(enemy)
}*/
//lv1
fun main() {
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 게임 끝내기")

    val selcetMenu = readLine()!!.toInt()

    when (selcetMenu) {
        1 -> startGame()
        2 -> endGame()
    }
}
fun startGame() {
    println("게임이 시작되었습니다.")
}

fun endGame() {
    println("게임이 종료되었습니다.")
}