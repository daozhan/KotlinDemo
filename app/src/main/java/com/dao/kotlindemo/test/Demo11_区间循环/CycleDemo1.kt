package com.dao.kotlindemo.test.Demo11_区间循环

/**
 *
 * @author daoz
 * @date :2020/3/16 17:39
 */

fun main(args: Array<String>) {
    val nums = 1 .. 100
    var result = 0
    for (num in nums){
        result += num
    }

    print("结果：${result}")

}