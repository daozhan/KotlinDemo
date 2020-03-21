package com.dao.kotlindemo.test.Demo20_抽象类和接口

/**
 *
 * @author daoz
 * @date :2020/3/17 16:25
 */

fun main(args: Array<String>) {
    var man1 = Man()
    val man2 = TaiJian()

    val house = listOf<Human>(man1, man2)
    for (p in house){
        if (p is Man){
            p.eat()
        }
    }
}