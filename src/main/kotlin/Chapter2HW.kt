package org.example
//lv1.
fun main() {
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 게임 끝내기")
// 입력 받을 것을 변수에 넣을거다.
    val selcectedMenu = readLine()!!.toInt() // 사람이 넣은 값을 Int로 바꿈

    var value = when (selcectedMenu) {
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