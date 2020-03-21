package com.dao.kotlindemo.test.Demo16_计算器

import java.lang.Exception

/**
 *
 * @author daoz
 * @date :2020/3/17 11:02
 */

fun main(args: Array<String>) {
    while (true) {
        println("欢迎使用!")
        println("请输入第一个数字")
        var num1str = readLine()
        println("请输入第二个数字")
        var num2str = readLine()

        try {
            var num1: Int = num1str!!.toInt()
            var num2: Int = num2str!!.toInt()
            // 相加不能都为空
            println("${num1} + ${num2} = ${num1 + num2}")
        } catch (e: Exception) {
            println("大哥，请输入数字哦！")
        }
    }
}