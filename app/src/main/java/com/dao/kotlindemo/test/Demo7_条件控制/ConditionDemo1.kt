package com.dao.kotlindemo.test.Demo7_条件控制

/**
 *
 * @author daoz
 * @date :2020/3/16 15:26
 */

fun checkFace(score: Int) {
    if (score > 80) {
        println("这个是一个帅哥")
    } else {
        println("这个是一个衰哥")
    }
}

fun main(args: Array<String>) {
    var score = 180
    checkFace(score)
}