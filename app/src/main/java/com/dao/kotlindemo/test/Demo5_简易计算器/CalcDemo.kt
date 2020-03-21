package com.dao.kotlindemo.test.Demo5_简易计算器

/**
 * 函数 - 简易计算器
 * @author daoz
 * @date :2020/3/16 11:01
 */

fun main(args: Array<String>) {
    var a = 8
    var b = 2

    println("a+b=${plus(a, b)}")
    println("a-b=${sub(a, b)}")
    println("a*b=${multiply(a, b)}")
    println("a/b=${except(a, b)}")
}

// fun固定写法 plus 函数名称(a 第一个参数, 类型 Int) : 返回值是Int类型
fun plus(a: Int, b: Int): Int {
    return a + b
}

// 减
fun sub(a: Int, b: Int): Int {
    return a - b
}

// 乘
fun multiply(a: Int, b: Int): Int {
    return a * b
}

// 除
fun except(a: Int, b: Int): Int {
    return a / b
}
