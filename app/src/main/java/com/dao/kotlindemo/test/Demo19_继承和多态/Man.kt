package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 *
 * @author daoz
 * @date :2020/3/17 15:18
 */

class Man(name: String) : Human(name){

    override fun eat() {
        println("$name 哇哇哇的大口吃")
    }

    override fun pee() {
        println("$name 站着尿尿")
    }
}