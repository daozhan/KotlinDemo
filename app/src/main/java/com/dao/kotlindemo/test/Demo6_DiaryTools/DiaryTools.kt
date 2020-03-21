package com.dao.kotlindemo.test.Demo6_DiaryTools

/**
 *
 * @author daoz
 * @date :2020/3/16 15:03
 */

fun main(args: Array<String>) {
   var diary = diaryGenerater("滕王阁")
    println(diary)
}
fun diaryGenerater(placeName: String) : String{
    var temple =
        """今天天气晴朗，万里无云，我们去${placeName}游玩，
            首先映入眼帘的是，${placeName}${placeName.length}个鎏金大字
        """
    return temple
}