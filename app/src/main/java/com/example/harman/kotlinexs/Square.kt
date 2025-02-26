package com.example.harman.kotlinexs

class Square(val side: Int) {
    init {
        println(side * 2)
    }
}

fun main() {
    var sq = Square(20)
}
