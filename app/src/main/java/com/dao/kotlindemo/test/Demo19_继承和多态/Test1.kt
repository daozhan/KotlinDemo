package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 *
 * @author daoz
 * @date :2020/3/17 14:50
 */

fun main(args: Array<String>) {
    val son1 = Son()
    println("儿子的性格${son1.character}")
    son1.action()
}