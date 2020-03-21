package com.dao.kotlindemo.test.Demo12_list和map

import java.util.*

/**
 *
 * @author daoz
 * @date :2020/3/17 9:22
 */

fun main(args: Array<String>) {
    var map = TreeMap<String, String>()
    map["好"] = "good"
    map["学习"] = "study"
    map["天"] = "day"
    map["向上"] = "up"

    println(map["好"])
}