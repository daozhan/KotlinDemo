package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 * 孩子
 * @author daoz
 * @date :2020/3/17 14:48
 */

class Son : Father(){
    override fun action(){
        println("儿子很乖, 在公共场合很有礼貌")
    }
}