package org.example

//lv2. null처리 2번
fun main() {
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 캐릭터 추가")
    println("3. 게임 끝내기")
// 입력 받을 것을 변수에 넣을거다.
    val selcectedMenu = readLine()!!.toInt() // 사람이 넣은 값을 Int로 바꿈

    var value = when (selcectedMenu) {
        1 -> startGame()
        2 -> createCharacter()
        3 -> endGame()

    }
}

fun startGame() {
    println("게임이 시작되었습니다.")
}

fun createCharacter() {
    val characterList: MutableList<Map<String, String>> = mutableMapOf()// 리스트 타입 지정해야함. 리스트에서는 똑같은 타입 하나만 넣을 수 있음.
   // 1번 처리 val characterList: MutableList<Map<String, String?>> = mutableMapOf()
    //키가 string, value도 string

    println("추가할 캐릭터의 이름을 엽력해주세요.") //2번 Evis연산자 사용
    val name = readLine() ?: ""

    println("추가할 캐릭터의 직업을 입력해주세요.")
    val job = readLine() ?: ""
    // 이름과 직업이 항상 같이 다니면 편하다. map 자료구조로 만들어서 다룰 것이다. 키와 값
    val character = mapOf("name" to name, "job" to job) // 캐릭터 1개 만드는 것
    //이제 리스트에 캐릭터를 넣는 코르를 만들거다.
    characterList.add(character)
    //에러가 뜨는 이유
    //Required와 Found에 타입이 미스매치다
    //name과 job은 string? 타입인데 nullablestring타입인데 그 이유는 사용자에게 입력 받는 값이기 때문이다.
    //characterList는 string?가 아니라 그냥 string 타입이다.
    //해결 방법은 2가지가 있음.
    //1.characterList에 ?를 붙힌다.
    //2.name의 readLine의 값이 null일 수 있으니까 null일 때 어떻게 처리할지 지정을 할 수 있다. Elvis연산자 사용 ?: ""
}

fun endGame() {
    println("게임이 종료되었습니다.")
}
