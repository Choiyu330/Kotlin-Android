package com.example.kotlin.Kotlin

import android.speech.tts.TextToSpeech

// 18. Class

// 00P -> Object Oriented Programing (객체지향 프로그래밍)

// "객체"란 뭘까?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍 문제 해결방법
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다
// - ex) 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 한다

fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스(Instance)화 -> 인스턴스(객체)를 얻음
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

}

// 클래스(설명서) 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법 (2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

}
