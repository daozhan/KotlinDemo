package com.dao.kotlindemo.test.Demo17_递归

import java.math.BigInteger

/**
 * 演示递归
 * 阶乘 1的阶乘1 2的阶乘2*1 3的阶乘3*2*1 4的阶乘4*3*2*1@author
 * 5的阶乘5*4*3*2*1  计算n的阶乘
 * @author daoz
 * @date :2020/3/17 11:12
 */

fun main(args: Array<String>) {
    var num = BigInteger("15")
    // 计算5的阶乘
    println(fact(num))
}

fun fact(num: BigInteger): BigInteger {
    return if (num == BigInteger.ONE) {
        BigInteger.ONE
    } else {
        num * fact(num - BigInteger.ONE)
    }
}


