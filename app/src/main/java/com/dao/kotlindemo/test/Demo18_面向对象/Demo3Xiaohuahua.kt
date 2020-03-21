package com.dao.kotlindemo.test.Demo18_面向对象

/**
 * 程序员B写的代码
 * @author daoz
 * @date :2020/3/17 11:54
 */

fun main(args: Array<String>) {
    var washMachine = WashMachine("小天鹅", 50)
    washMachine.openDoor()
    println("小华华牛仔裤放进去了")
    washMachine.closeDoor()
    washMachine.selectMode(2)
    washMachine.star()

}