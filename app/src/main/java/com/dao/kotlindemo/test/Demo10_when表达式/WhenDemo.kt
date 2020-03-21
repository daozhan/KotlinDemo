package com.dao.kotlindemo.test.Demo10_when表达式

/**
 *
 * @author daoz
 * @date :2020/3/16 16:37
 */

fun gradeStudent(score:Int){
    when(score){
        10 -> println("考了满分，棒棒哒！")
        9 -> println("干的不错")
        8 -> println("还可以")
        7 -> println("还需努力")
        6 -> println("刚好及格")
        else -> println("需要努力")
    }
}

fun main(args: Array<String>) {
    gradeStudent(9)
}