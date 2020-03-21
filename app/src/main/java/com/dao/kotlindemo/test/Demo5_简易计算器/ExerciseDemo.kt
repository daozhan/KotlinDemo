package com.dao.kotlindemo.test.Demo5_简易计算器

/**
 *
 * @author daoz
 * @date :2020/3/16 14:19
 */

fun main(args: Array<String>) {
    println(sayHello("老王"))
    println(checkAge(21))
}

fun sayHello(name: String): String {
    return "你好：$name"
}

fun checkAge(age: Int): Boolean {
    return age > 18
}

fun save(logLevel: Int) {

}