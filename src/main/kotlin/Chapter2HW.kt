//lv1 -> lv2 -> lv3
fun main() {
    var isValidMenu = false
    var selectedMenu = 0

    while (isValidMenu == false) {
        try {
            selectedMenu = getMenuNumber() //selectedMenu는 try 안에만 있기 때문에 바깥까지 전달이 안됨
            isValidMenu = true
        } catch (e: Exception) { // 왜 예외처리를 했지
            isValidMenu = false
        }
    }
    when (selectedMenu) {
        1 -> startGame()
        2 -> createCharacter()
        3 -> endGame()
    }
}

fun getMenuNumber(): Int {
    println("메뉴를 입력해주세요.")
    println("1. 게임 시작하기")
    println("2. 캐릭터 추가")
    println("3. 게임 끝내기")

    val userInput = readLine()!!.toInt()

    if (userInput < 1 || userInput > 3) {
        throw Exception("입력이 잘못되었습니다.")
    }
    return userInput
}

fun startGame() {
    println("게임이 시작되었습니다.")
}

fun createCharacter() { // <Map<String, String>> 원래 이 구조인가?
    val characterList: MutableList<Map<String, String>> = mutableListOf()

    var isNeedMoreCharacter = "Y"

    while (isNeedMoreCharacter == "Y") {
        println("추가할 캐릭터의 이름을 입력해주세요.")
        val name = readLine() ?: "" // ?: "" 이해가 안가네

        println("추가할 캐릭터의 직업을 입력해주세요.")
        val job = readLine() ?: ""

        val character = mapOf("name" to name, "job" to job)

        characterList.add(character)

        println("사용자를 더 추가하시겠습니까? (Y: 추가, N: 그만두기)")
        isNeedMoreCharacter = readLine() ?: "N"
    }
    characterList.forEach { // 왜 forEach지?
        println(it) // it은 왜 쓴거야?
    }
}

fun endGame() {
    println("게임이 종료되었습니다.")
}
