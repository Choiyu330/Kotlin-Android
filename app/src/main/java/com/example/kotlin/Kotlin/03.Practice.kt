package com.example.kotlin.Kotlin

// 220321 Kotlin 개인공부

var a = 1 + 2 + 3 + 4 + 5 //연산의 결과값을 변수에 넣어 줄 수 있다
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "YuJin"
var f = "My name is $e Nice to meet you!"

// Null
// - 존재하지 않는다

// var abc : Int = null
// 아래와 같이 ? 를 붙이면 null을 자료형에 넣을 수 있음
var abc1 : Int? = null
var abc2 : Double? = null

var g = a + 3
fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)

    println(g)

}
