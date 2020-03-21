package com.dao.kotlindemo.test.Demo17_递归

/**
 * 累加操作
 * 1的累加1 2的累加就是=2+1 3的累加就是3+2+1
 * @author daoz
 * @date :2020/3/17 11:21
 */

fun main(args: Array<String>) {
    var result = 0
    println(ollAdd(100000, result))
}

tailrec fun ollAdd(num:Int, result: Int) :Int{
    println("计算器第${num}次运算, result=${result}")
    return if (num == 1){
        1
    }else{
        ollAdd(num -1, result + num)
    }
}
