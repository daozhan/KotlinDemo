package com.dao.kotlindemo.test.Demo18_面向对象

/**
 *
 * @author daoz
 * @date :2020/3/17 11:37
 */

class Rect(var height: Int, var width:Int)

fun main(args: Array<String>) {
    var  rect01 = Rect(20, 10)

    println("矩形的高度: ${rect01.height}")
    println("矩形的宽度: ${rect01.width}")
}