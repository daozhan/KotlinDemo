package com.dao.kotlindemo.test.Demo19_继承和多态

/**
 *
 * @author daoz
 * @date :2020/3/17 14:47
 */

open class Father{
    var character:String = "性格内向"
    open fun action(){
        println("公共场合喜欢大声说话")
    }
}