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

/*
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
*/
/*
//계산기 과제 기초 해설
class Score(
    var num: Int
)

fun main() {
    val score = Score(10)
    println("1. ${score.num}")
    callByReference(score)
    println("2. ${score.num}")
}

fun callByReference(score: Score) {
    println("3. ${score.num}")
    score.num += 50
    println("4. ${score.num}")
}*/
/*
fun main() {
    var bird = Bird() //인스턴스화 하고 있다, 실체화
    var chicken = Chicken()
    var sparrow = Sparrow()
    var pigeon = Pigeon()

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird { // 상속 받기 위해 open이라는 키워드를 붙여주고 그것을 아래의 Chicken, Sparrow, Pigeon이 상속을 받는다.
    fun fly() {
        println("새는 날아요~")
    }
}
//Chicken, Sparrow, Pigeon은 fun fly가 없지만 Bird()를 상속을 받았기 때문에 동작을 할 수 있다.
//상속을 받지 않았다면 각각 fun fly를 만들어줘야 한다.
//fun fly를 수정하면 상속 받은 나머지 클래스도 다 같이 수정된다.
class Chicken : Bird() {

}

class Sparrow : Bird() {

}

class Pigeon : Bird() {

}*/
/*// study: class
fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭")
    var sparrow = Sparrow("참새")
    var pigeon = Pigeon("비둘기")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}
// 생성자를 사용할 때 class를 만들면서 생성하면서 미리 전달해야 하는 값 var name: String를 () 소괄호 안에다
//넣을 수가 있었는데 생성자를 사용하는 경우에는 자식 객체에서도 이 값을 전달해줘야 한다. #1

open class Bird(
    var name: String
) {
    fun fly() {
        println("${name} 날아요~") //Bird의 날아요는 자기가 가지고 있는 name을 가지고 날아요를 하는 것이다.
    }

}
//#1 부모 클래스 Bird가 name이라는 값을 받아야 한다. Bird를 상속하는 입장에서도 어떻게든 Bird에 생성자를 호출하면서 값을 전달을 해야함
//Chicken은 Chicken 클래스 생성자에서 name: String을 받아서 요걸 그대로 Bird(name)에 전달해줘라
class Chicken(name: String) : Bird(name) {

}

class Sparrow(name: String) : Bird(name) {

}

class Pigeon(name: String) : Bird(name) {
}*/

//주 생성자의 사용 예시
// 클래스 선언부에 생성자를 명시함
class Character( //클래스를 만들면서 () 소괄호를 열고 닫고 / 소괄호 안에 들어가는 부분이 주 생성자라고 볼 수 있음.
    var name:String, // Character를 만들 때는 name, hairColor, height가 필요하다 이것을 전달해줘야 한다.
    var hairColor:String, // 너가 인스턴트를 만들 떄는 요 3가지 값을 전달해야 한다. 이것이 주 생성자
    var height:Double
) {
    fun fireBall() {
        println("파이어볼!")
    }
    fun compositing(device1:String, device2:String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}

//부 생성자의 사용 예시
class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    // 명시적 생성자 (Constructor)
    // _name, _hairColor, _height와 같이 생성자에 변수를 넘기는 경우에 사용함
    constructor(_name: String, _hairColor: String, _height: Double) {
        println("${_name}을 생성자로 넘겼어요")
        println("${_hairColor}를 생성자로 넘겼어요")
        println("${_height}를 생성자로 넘겼어요")

        name = _name
        hairColor = _hairColor
        height = _height
    }

    fun fireBall() {
        println("파이어볼!")
    }
    fun compositing(device1:String, device2:String): String {
        val device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}