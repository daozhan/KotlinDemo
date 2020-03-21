package com.dao.kotlindemo.test.Demo15_字符串和数字

/**
 *
 * @author daoz
 * @date :2020/3/17 10:55
 */

fun main(args: Array<String>) {
    var a = "13"
    var b = 13

    a = b.toString() // 把b数字转换成字符串放入a里面

    b = a.toInt() // 把a字符串转换成数字放入b里面

    var c = "3"
    b = c.toInt()

}