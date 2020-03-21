package com.dao.kotlindemo.test.Demo8_字符串比较

/**
 *
 * @author daoz
 * @date :2020/3/16 15:34
 */
fun main(args: Array<String>) {
    val str1 = "Andy"
    val str2 = "andy"

    // == 等同于 Java 里面的 equals
//    println(str1 == str2)
    println(str1.equals(str2, true))
    // 第二个参数代表忽略大小写
}