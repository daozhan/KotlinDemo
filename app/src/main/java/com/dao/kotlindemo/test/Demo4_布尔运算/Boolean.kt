package com.dao.kotlindemo.test.Demo4_布尔运算

/**
 * Boolean 布尔 true真  false 假
 * @author daoz
 * @date :2020/3/16 10:27
 */

fun main(args: Array<String>) {
    var  num1 = 4
    var  num2 = 6

    println(num1 > num2)

    // 根号
    var num3 = Math.sqrt(5.0) - Math.sqrt(4.0)
    var num4 = Math.sqrt(4.0) - Math.sqrt(3.0)

    println(num3 > num4)
    println("num3 = $num3")
    println("num4 = $num4")


    var num5 = Math.pow(2019.0, 2018.0)
    var num6 = Math.pow(2018.0, 2019.0)

    println(num6 > num5)
    println("num3 = $num6")
    println("num4 = $num5")

}

