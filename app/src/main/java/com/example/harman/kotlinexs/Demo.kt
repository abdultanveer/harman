package com.example.harman.kotlinexs

fun main() {
    /**
     * this is the no of dogs in the house
     */
    val numberOfDogs:Int = 3

    /**
     *
     */
    val numberOfCat = 2
    val name = "Jennifer"
    var c = sum(10,20)

    println("I have $numberOfDogs dogs" + " and $numberOfCat cats")
    throw  NullPointerException("crash demo")
    println("the sum is"+ sum(1,3))
}


/**
 * @see   stackoverlow.com
 * this method adds 2 nos/2 ints
 */
fun sum(x: Int, y: Int) = x + y