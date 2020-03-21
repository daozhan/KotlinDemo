package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 * 抽象的人类
 * @author daoz
 * @date :2020/3/17 15:01
 */

abstract class Human(var name:String){
    abstract fun eat()

    abstract fun pee()
}