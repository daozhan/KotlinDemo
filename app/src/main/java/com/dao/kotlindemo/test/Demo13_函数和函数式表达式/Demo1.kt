package com.dao.kotlindemo.test.Demo13_函数和函数式表达式

/**
 *
 * @author daoz
 * @date :2020/3/17 9:33
 */

fun main(args: Array<String>) {
    var result = add(3, 5)
    println(result)

    var i = { x: Int, y: Int -> x + y }
    println(i(8, 878))

    val j: (Int, Int) -> Int = { x, y -> x + y }
    println(j(12, 878))
}

fun add(x: Int, y: Int): Int = x + y
