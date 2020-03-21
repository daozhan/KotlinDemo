package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 *
 * @author daoz
 * @date :2020/3/17 15:20
 */
class Woman(name: String) : Human(name){
    override fun eat() {
        println("$name 哇哇哇的小口吃")
    }

    override fun pee() {
        println("$name 蹲着尿尿")
    }

}