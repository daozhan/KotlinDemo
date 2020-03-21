package com.dao.kotlindemo.test.Demo22_枚举

/**
 *
 * @author daoz
 * @date :2020/3/17 17:28
 */

enum class Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期天
}

fun main(args: Array<String>) {
    println(Week.星期一.ordinal)
}