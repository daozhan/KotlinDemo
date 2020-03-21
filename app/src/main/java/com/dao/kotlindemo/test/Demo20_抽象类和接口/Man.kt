package com.dao.kotlindemo.test.Demo20_抽象类和接口

/**
 *
 * @author daoz
 * @date :2020/3/17 15:59
 */

class Man:Human(), IMan{
    override fun eat() {
        println("大口吃饭")
    }

    override fun xiaodidi() {
        println("18cm是我的")
    }
}