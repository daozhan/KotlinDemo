package com.dao.kotlindemo.test.Demo18_面向对象

/**
 *
 * @author daoz
 * @date :2020/3/17 11:40
 */
// 妹子 长相 声音
class Girl(var chactor: String, var voice:String){
    fun smile(){
        println("妹子笑了一下")
    }
    fun cry(){
        println("妹子哭了")
    }
}

fun main(args: Array<String>) {
    var girl = Girl("彪悍", "甜美")

    println("这位妹子的声音: ${girl.voice}")
    girl.smile()
    girl.cry()
}