package com.dao.kotlindemo.test.Demo9_空值处理

/**
 * 空值处理
 * @author daoz
 * @date :2020/3/16 16:03
 */

// 接收一个参数 参数是非空的String类型
// 加上 ? 代表参数可以为空
fun heat(str:String?):String{
    return "热" + str
}

fun main(args: Array<String>) {
    val result1 = heat("水")
    println(result1)

    println( heat(null))

}