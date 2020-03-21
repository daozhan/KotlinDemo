package com.dao.kotlindemo.test.Demo12_list和map

/**
 *
 * @author daoz
 * @date :2020/3/16 18:06
 */

fun main(args: Array<String>) {
    var lists = listOf("买鸡蛋", "买大米", "买冰淇淋")
    for ((i, e) in lists.withIndex()){
        println("$i  $e")
    }
}