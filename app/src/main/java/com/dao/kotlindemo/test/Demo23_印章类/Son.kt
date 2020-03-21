package com.dao.kotlindemo.test.Demo23_印章类

/**
 * 小母驴, 小公驴, 小公马生的儿子
 * @author daoz
 * @date :2020/3/17 17:32
 */

sealed class Son{
    fun sayHello(){
        println("大家好!!")
    }

    class 小小驴():Son()
    class 小骡子():Son()
}