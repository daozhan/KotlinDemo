package com.dao.kotlindemo.test.Demo7_条件控制

/**
 *
 * @author daoz
 * @date :2020/3/16 15:29
 */

fun returnBig(a: Int, b: Int): Int {
    if (a > b) return a else return b
}

fun main(args: Array<String>) {
    val a = 3
    val b = 5

    println("较大的那个数值为${returnBig(a, b)}")
}