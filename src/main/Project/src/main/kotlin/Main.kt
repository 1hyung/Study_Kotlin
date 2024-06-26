package org.example
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
*//*
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
}*//*
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

}*//*// study: class
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

/*//주 생성자의 사용 예시
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
    constructor(_name: String, _hairColor: String, _height: Double) { //부 생성자는 constructor 키워드로 만들 수 있다
        println("${_name}을 생성자로 넘겼어요") // Character가 주 생성자와 똑같이 name, hairColor, height가 있는데 명시적 생성자인 Constructor를 사용해서
        println("${_hairColor}를 생성자로 넘겼어요") // var name: String = "", var hairColor: String = "", var height: Double = 0.0 초기화 하는 부분을 만들 수 있다.
        println("${_height}를 생성자로 넘겼어요") // constructor (생성자가 받아야 할 매개변수) {이걸 가지고 생성하면서 실행할 로직} 을 작성
        //3가지 전달 받은 매개변수를 각각 생성자로 넘겼어요 라고 출력을 하고 _name으로 전달 받은 값을 var name 전달 _hairColor, _height도 동일

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
//두 개의 생성자를 선택해서 실체화
class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0
    var age: Int = 0
    var gender: String = ""

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

    // _name, _hairColor, _height, _age, _gender와 같이 생성자에 변수를 넘기는 경우에 사용함
    constructor(_name: String, _hairColor: String, _height: Double, _age: Int, _gender: String) {
        println("${_name}을 생성자로 넘겼어요")
        println("${_hairColor}를 생성자로 넘겼어요")
        println("${_height}를 생성자로 넘겼어요")
        println("${_age}를 생성자로 넘겼어요")
        println("${_gender}를 생성자로 넘겼어요")

        name = _name
        hairColor = _hairColor
        height = _height
        age = _age
        gender = _gender
    }

    fun fireBall() {
        println("파이어볼!")
    }

    fun compositing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}*/

/*
//3-7 접근제한자
// AccessTestClass를 만들어서
//싱태에 접근제한자가 없는거, public이 있는거, private가 있는 것을 만듦
class AccessTestClass {
    var b = 2
    public var a:Int = 1
    private var c = 3

    //함수에 접근제한자가 없는거, public이 있는거, private가 있는 것을 만듦
    fun publicTest() {
        println("public 입니다")
    }

    public fun publicTest2() {
        println("public 입니다")
    }

    private fun privateTest() {
        println("private 입니다")
    }
}
// 위처럼 만들고 main함수에서
fun main() {
    var accessTestClass = AccessTestClass()
    //AccessTestClass() 생성해서 인스턴스 하나를 생성했음.
// . 하고 접근가능한 요소를 확인
//    accessTestClass.
    accessTestClass.b //접근이 됨
    accessTestClass.a //접근이 됨
    accessTestClass.c //private이기 때문에 접근이 안됨
}*/
/*//3-8 오버라이딩
fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭", 2)
    var sparrow = Sparrow("참새", "갈색")
    var pigeon = Pigeon("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(
    val name: String
) {
    open fun fly() {
        println("${name}은 날아요~")
    }
}

class Chicken(
    name: String, val age: Int
) : Bird(name) {

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${age}살의 ${name}가 날아봅니다~ 꼬끼오!")
    }
}

class Sparrow(
    name: String, val color: String
) : Bird(name) {

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon(
    name: String, val address: String
) : Bird(name) {

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${address} 살고있는 ${name}가 날아봅니다~ 구구!")
    }
}*/

//3-9 오버로딩
fun main() {
    var calc = Calculator()
//#1
    //add를 호출하면서 인자를 1,2 호출하면 Int로 구성된 add 그게 결과를 저장
    var intResult = calc.add(1,2)
    var doubleResult = calc.add(1.2, 2.2)
//인자를 double형으로 넣으면 add가 double로 구성된 것이 호출돼서 result에 반환
    println("정수 덧셈결과: ${intResult}")
    println("실수 덧셈결과: ${doubleResult}")

}

class Calculator { //Calculator라는 class를 만들었음
    //add를 두개 만듬 add라는 함수는 num1, num2라는 매개변수를 가지는데 둘 다 Int로 만듬
    // 둘 다 더한 값을 리턴한다.

    fun add(num1: Int, num2: Int): Int { // 구분하기 위해 출력문 추가
        println("int형 add 입니다.")
        return num1+num2
    }
//오버로딩을 사용해서 함수를 다시 한번 정의하면서 이번에는 Double형으로 매개변수를 받음
    //더한 값을 return

    fun add(num1: Double, num2: Double): Double {
        println("double형 add 입니다.")
        return num1+num2
    //이렇게 오버로딩을 하면 두가지로 정의할 수가 있고 #1 호출할 때마다 인자를 어떻게 넘겼는지에 따라서
    //각각 다른 함수가 호출이 된다.
    }
}