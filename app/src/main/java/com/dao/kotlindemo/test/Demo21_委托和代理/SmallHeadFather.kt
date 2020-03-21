package com.dao.kotlindemo.test.Demo21_委托和代理

/**
 * 小头爸爸
 * @author daoz
 * @date :2020/3/17 17:00
 */
class SmallHeadFather:IWashBowl by BigHeadSon{
    override fun washing() {
        println("我是小头爸爸，我赚了10块钱")
        BigHeadSon.washing()
        println("我看儿子把碗洗好了")
    }
}