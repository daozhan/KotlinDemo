package com.dao.kotlindemo.test.Demo10_when表达式

/**
 * 日记
 * @author daoz
 * @date :2020/3/16 17:13
 */

fun diaryGenerator(placeName:String){
    val diary =  """今天天气晴朗，万里无云，我们去${placeName}游玩，
            首先映入眼帘的是，${placeName}${numToChinese(placeName.length)}个鎏金大字
            """
    println(diary)
}

fun numToChinese(num:Int):String{
    val result = when(num){
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        else -> "地名太长了"
    }
    return result
}

fun main(args: Array<String>) {
    diaryGenerator("滕王阁")
}