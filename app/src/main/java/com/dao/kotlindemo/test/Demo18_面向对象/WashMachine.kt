package com.dao.kotlindemo.test.Demo18_面向对象

import android.widget.TableRow

/**
 * 程序员A建立的洗衣机
 * @author daoz
 * @date :2020/3/17 11:52
 */

class WashMachine (var module:String, var size:Int){
    var isDoorOpen = true
    var currentMode = 0

    fun openDoor(){
        println("洗衣机的门打开了...")
        isDoorOpen = true
    }
    fun closeDoor(){
        println("洗衣机的门关闭了...")
        isDoorOpen = false
    }

    fun selectMode(mode: Int){
        currentMode = mode
        when(mode){
            0 -> println("初始模式, 请您选择模式")
            1 -> println("轻柔")
            2 -> println("狂揉")
            else -> println("不要乱拧!!")
        }
    }

    fun star(){
        if (isDoorOpen){
            println("哔哔...门还没有关，不能运行")
        }else{
            when(currentMode){
                0 -> println("选择模式错误, 不能开始洗衣服")
                1 -> {
                    println("放水...")
                    println("轻柔模式, 发动机转数 慢")
                    setMotorSpeed(100)
                    println("水放满了...")
                    println("电机开始转了...")
                    println("洗好了...")
                }
                2 -> {
                    println("放水...")
                    println("狂揉模式, 发动机转数 快")
                    setMotorSpeed(1000)
                    println("水放满了...")
                    println("电机开始转了...")
                    println("洗好了...")
                }
                else -> println("选择模式错误!!!")
            }
        }
    }

    private fun setMotorSpeed(speed:Int){
        println("当前发动机转数:${speed}圈/秒")
    }
}