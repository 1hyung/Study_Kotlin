// package org.example
//
// //*
// /TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// fun main() {
// val name = "Kotlin"
// //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// // to see how IntelliJ IDEA suggests fixing it.
// println("Hello, " + name + "!")
//
// for (i in 1..5) {
// //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
// println("i = $i")
// }
// }
// // 3-1 객체지향 코드 예시
// class Hero {
// var damage = 10
// var healthPoint = 100
//
// fun attack(target: Enemy) {
// println("공격했다!")
// target.takeAttack(this.damage)
// }
// }
//
// class Enemy {
// var damage = 10
// var healthPoint = 100
//
// fun takeAttack(damage: Int) {
// println("공격받았다!")
// this.healthPoint -= damage
// }
// }
//
//
// fun main() {
// val hero = Hero()
// val enemy = Enemy()
//
// hero.attack(enemy)
// }
//
//
// */
// //lv1 -> lv2 -> lv3
// fun main() {
// var isValidMenu = false
// var selectedMenu = 0
//
// while (isValidMenu == false) {
// try {
// selectedMenu = getMenuNumber()
// isValidMenu = true
// } catch (e: Exception) { // 왜 예외처리를 했지
// e.printStackTrace() // 확실한 예외처리
// isValidMenu = false
// }
// }
// when (selectedMenu) {
// 1 -> startGame()
// 2 -> createCharacter()
// 3 -> endGame()
// }
// }
//
// fun getMenuNumber(): Int {
// println("메뉴를 입력해주세요.")
// println("1. 게임 시작하기")
// println("2. 캐릭터 추가")
// println("3. 게임 끝내기")
//
// val userInput = readLine()!!.toInt()
//
// if (userInput < 1 || userInput > 3) { // || 뭐지? 느낌이 1~3 사이 선택 안하면 입력이 잘못됐다는거 같은데
// throw Exception("입력이 잘못되었습니다.") // 입력이 잘못되었습니다 출력이 왜 안돼??
// }
// return userInput
// }
//
// fun startGame() {
// println("게임이 시작되었습니다.")
// }
//
// fun createCharacter() { // <Map<String, String>> 원래 이 구조인가?
// val characterList: MutableList<Map<String, String>> = mutableListOf()
//
// var isNeedMoreCharacter = "Y"
//
// while (isNeedMoreCharacter == "Y") {
// println("추가할 캐릭터의 이름을 입력해주세요.")
// val name = readLine() ?: "" // ?: "" 이해가 안가네
//
// println("추가할 캐릭터의 직업을 입력해주세요.")
// val job = readLine() ?: ""
//
// val character = mapOf("name" to name, "job" to job)
//
// characterList.add(character)
//
// println("사용자를 더 추가하시겠습니까? (Y: 추가, N: 그만두기)")
// isNeedMoreCharacter = readLine() ?: "N"
// }
// characterList.forEach { // 왜 forEach지?
// println(it) // it은 왜 쓴거야?
// }
// }
//
// fun endGame() {
// println("게임이 종료되었습니다.")

fun main() {
    interface Character {
        fun attack(target: Character)
        fun tackAttack(damage: Int)
    }

    class Hero : Character {
        var damage = 10
        var healthPoint = 100

        override fun attack(target: Enemy) {
            println("공격했다!")
            target.takeAttack(this.damage)
        }

        override fun takeAttack(damage: Int) {
            println("공격받았다!")
            this.healthPoint -= damage
        }
    }

    class Enemy : Character {
        var damage = 10
        var healthPoint = 100

        override fun attack(target: Enemy) {
            println("공격했다!")
            target.takeAttack(this.damage)
        }

        override fun takeAttack(damage: Int) {
            println("공격받았다!")
            this.healthPoint -= damage
        }
    }
}

