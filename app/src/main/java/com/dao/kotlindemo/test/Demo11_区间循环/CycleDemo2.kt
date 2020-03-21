package com.dao.kotlindemo.test.Demo11_区间循环

/**
 *
 * @author daoz
 * @date :2020/3/16 17:39
 */

fun main(args: Array<String>) {
//    val nums = 1 until 100  // [1,100)
//    for (num in nums){
//        print("${num},")
//    }

    var nums = 1..16
//    for (num in nums step 2){
//        print("${num},")
//    }

    var nums2 = nums.reversed()

    for (a in nums2) {
        println(a)
    }

    println("总数为: ${nums.count()}")
}