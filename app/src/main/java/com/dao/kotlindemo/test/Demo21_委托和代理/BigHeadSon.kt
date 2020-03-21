package com.dao.kotlindemo.test.Demo21_委托和代理

/**
 * 大头儿子
 * @author daoz
 * @date :2020/3/17 17:00
 */
object BigHeadSon:IWashBowl {
    override fun washing() {
        println("我是大头儿子，我在开心的洗碗，一次赚1块钱")
    }
}